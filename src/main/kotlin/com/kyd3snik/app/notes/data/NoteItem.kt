package com.kyd3snik.app.notes.data

import com.kyd3snik.app.base.BaseItem
import javax.persistence.Entity

@Entity
data class NoteItem(
    override val name: String,
    val text: String
) : BaseItem()
