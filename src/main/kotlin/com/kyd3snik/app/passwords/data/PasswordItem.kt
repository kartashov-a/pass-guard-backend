package com.kyd3snik.app.passwords.data

import com.kyd3snik.app.base.BaseItem
import javax.persistence.Entity

@Entity
data class PasswordItem(
    override val name: String,
    val login: String,
    val password: String,
    val url: String?
) : BaseItem()
