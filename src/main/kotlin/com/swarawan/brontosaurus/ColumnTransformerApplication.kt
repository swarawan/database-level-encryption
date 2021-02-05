package com.swarawan.brontosaurus

import com.swarawan.brontosaurus.db.runner.Runner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ColumnTransformerApplication @Autowired constructor(
    private val runner: Runner
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        runner.start()
    }
}

fun main(args: Array<String>) {
    runApplication<ColumnTransformerApplication>(*args)
}
