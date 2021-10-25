package com.kyd3snik.app.passwords.data

import org.hibernate.validator.constraints.URL
import javax.validation.constraints.NotEmpty

data class PasswordRequest(
    @field:NotEmpty(message = "Название не можеть быть пустым")
    val name: String,
    @field:NotEmpty(message = "Логин не можеть быть пустым")
    val login: String,
    @field:NotEmpty(message = "Пароль не можеть быть пустым")
    val password: String,
    @field:URL(message = "Не валидный url")
    val url: String?
)

fun PasswordRequest.toEntity() = PasswordItem(name = name, login = login, password = password, url = url)