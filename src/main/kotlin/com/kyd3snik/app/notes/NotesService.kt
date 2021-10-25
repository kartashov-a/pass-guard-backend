package com.kyd3snik.app.notes

import com.kyd3snik.app.base.error.errorNotFound
import com.kyd3snik.app.notes.data.*
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class NotesService(
    private val repository: NotesRepository
) {

    fun getAllNotes(): List<NoteItemDto> {
        return repository.findAll().map(NoteItem::toDto)
    }

    fun createNote(note: NoteRequest): NoteItemDto {
        return repository.save(note.toEntity()).toDto()
    }

    fun updateNote(id: Long, note: NoteRequest): NoteItemDto {
        requireNote(id)
        return repository.save(note.toEntity()).toDto()
    }

    fun deleteNote(id: Long) {
        requireNote(id)
        repository.deleteById(id)
    }

    private fun requireNote(id: Long) {
        repository.findByIdOrNull(id) ?: errorNotFound("Note")
    }
}