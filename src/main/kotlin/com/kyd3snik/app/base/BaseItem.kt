package com.kyd3snik.app.base

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseItem {
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long = 0

    open val name: String = ""
}