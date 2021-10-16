package com.kyd3snik.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PassGuardBackendApplication

fun main(args: Array<String>) {
	runApplication<PassGuardBackendApplication>(*args)
}
