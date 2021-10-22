package com.kyd3snik.app.passwords.data

import org.hibernate.validator.constraints.URL
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty

data class PasswordRequest(
    @field:NotEmpty val name: String,
    @field:NotBlank val login: String,
    @field:NotBlank val password: String,
    @field:URL val url: String?
)

fun PasswordRequest.toEntity() = PasswordItem(name = name, login = login, password = password, url = url)