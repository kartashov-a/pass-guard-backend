package com.kyd3snik.app.passwords

import com.kyd3snik.app.passwords.data.*
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PasswordsService(
    private val repository: PasswordsRepository
) {

    fun getAllPasswords(): List<PasswordItemDto> {
        return repository.findAll().map(PasswordItem::toDto)
    }

    fun createPassword(password: PasswordRequest): PasswordItemDto {
        return repository.save(password.toEntity()).toDto()
    }

    fun updatePassword(id: Long, password: PasswordRequest): PasswordItemDto {
        requirePassword(id)
        return repository.save(password.toEntity()).toDto()
    }

    fun deletePassword(id: Long) {
        requirePassword(id)
        repository.deleteById(id)
    }

    private fun requirePassword(id: Long) {
        repository.findByIdOrNull(id) ?: error("Password not found") // TODO: 500 error
    }
}