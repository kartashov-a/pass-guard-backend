package com.kyd3snik.app.notes.data

data class NoteItemDto(
    val id: Long,
    val text: String,
)

fun NoteItem.toDto() = NoteItemDto(id, text)