package com.kyd3snik.app.notes

import com.kyd3snik.app.notes.data.NoteItem
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface NotesRepository : CrudRepository<NoteItem, Long>