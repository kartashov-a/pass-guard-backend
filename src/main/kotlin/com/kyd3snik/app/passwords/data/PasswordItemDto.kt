package com.kyd3snik.app.passwords.data

data class PasswordItemDto(
    val id: Long = 0,
    val name: String,
    val login: String,
    val password: String,
    val url: String?
)

fun PasswordItem.toDto(): PasswordItemDto = PasswordItemDto(id, name, login, password, url)