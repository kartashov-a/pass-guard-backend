package com.kyd3snik.app.notes.data

import javax.validation.constraints.NotEmpty

data class NoteRequest(
    @field:NotEmpty(message = "Название не можеть быть пустым")
    val name: String = "",
    val text: String = ""
)

fun NoteRequest.toEntity() = NoteItem(name, text)
