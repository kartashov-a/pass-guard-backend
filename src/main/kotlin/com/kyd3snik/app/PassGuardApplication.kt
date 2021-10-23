package com.kyd3snik.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PassGuardApplication

fun main(args: Array<String>) {
	runApplication<PassGuardApplication>(*args)
}
