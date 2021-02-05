package com.swarawan.brontosaurus.db.runner

import com.swarawan.brontosaurus.db.entity.Dinosaurus
import com.swarawan.brontosaurus.db.repository.DinosaurusRepo
import org.springframework.stereotype.Component
import java.util.*

@Component
class Runner constructor(private val repository: DinosaurusRepo) {

    val scanner = Scanner(System.`in`)

    fun start() {
        println("Operasi:")
        println("1. Tambah Data")
        println("2. Ambil semua data")
        print("Pilihan: (1..2) : ")

        when (scanner.nextInt()) {
            1 -> doInsert()
            2 -> findAll()
            else -> throw IllegalArgumentException("Pilihan tidak ditemukan")
        }
        start()
        scanner.nextLine()
    }

    private fun doInsert() {
        scanner.nextLine()

        print("Nama dino : ")
        val name = scanner.nextLine()

        val dinosaur = Dinosaurus(
            name = name,
            encryptedName = name
        )
        repository.save(dinosaur)
    }

    private fun findAll() {
        val data = repository.findAll()
        println("=================================================================")
        println("|  ID  |   Name    |   Encrypted Name      ")
        println("=================================================================")
        data.forEach {
            println("|  ${it.id}  |   ${it.name}    |   ${it.encryptedName}      |")
        }
        println("=================================================================")
    }
}