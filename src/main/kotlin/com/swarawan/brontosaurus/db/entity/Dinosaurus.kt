package com.swarawan.brontosaurus.db.entity

import com.swarawan.brontosaurus.db.utils.AppCredentials
import org.hibernate.annotations.ColumnTransformer
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*

@Entity
@Table(name = "dinosaurus")
@DynamicInsert
@DynamicUpdate
data class Dinosaurus(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long? = null,

    @Column(name = "name")
    val name: String? = null,

    @Column(name = "encrypted_name")
    @ColumnTransformer(
        read = "AES_DECRYPT(encrypted_name, ${AppCredentials.DB_SECRET_KEY})",
        write = "AES_ENCRYPT(?, ${AppCredentials.DB_SECRET_KEY})"
    )
    val encryptedName: String? = null
)