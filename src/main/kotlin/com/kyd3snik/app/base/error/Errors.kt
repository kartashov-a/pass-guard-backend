package com.kyd3snik.app.base.error

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

fun errorNotFound(entityName: String): Nothing = throw ResponseStatusException(
    HttpStatus.NOT_FOUND,
    "$entityName not found"
)