package com.kyd3snik.app.notes

import com.kyd3snik.app.notes.data.NoteItemDto
import com.kyd3snik.app.notes.data.NoteRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/notes")
class NotesController(
    val service: NotesService
) {

    @GetMapping
    fun getAllNotes(): ResponseEntity<List<NoteItemDto>> {
        return ResponseEntity.ok(service.getAllNotes())
    }

    @PostMapping
    fun createNote(@RequestBody @Valid request: NoteRequest): ResponseEntity<NoteItemDto> {
        return ResponseEntity.ok(service.createNote(request))
    }

    @PatchMapping("/{id}")
    fun updateNote(@PathVariable("id") id: Long, @RequestBody @Valid body: NoteRequest): ResponseEntity<NoteItemDto> {
        return ResponseEntity.ok(service.updateNote(id, body))
    }

    @DeleteMapping("/{id}")
    fun deleteNote(@PathVariable("id") id: Long): ResponseEntity<Any> {
        service.deleteNote(id)
        return ResponseEntity.ok(null)
    }
}