package com.swarawan.brontosaurus.db.repository

import com.swarawan.brontosaurus.db.entity.Dinosaurus
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DinosaurusRepo : JpaRepository<Dinosaurus, Long>