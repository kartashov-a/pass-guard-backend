package com.kyd3snik.app.passwords

import com.kyd3snik.app.passwords.data.PasswordItem
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PasswordsRepository : CrudRepository<PasswordItem, Long>