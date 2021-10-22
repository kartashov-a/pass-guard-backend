package com.kyd3snik.app.passwords

import com.kyd3snik.app.passwords.data.PasswordItemDto
import com.kyd3snik.app.passwords.data.PasswordRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/passwords")
class PasswordsController(
    val passwordsService: PasswordsService
) {

    @GetMapping
    fun getAllPasswords(): ResponseEntity<List<PasswordItemDto>> {
        return ResponseEntity.ok(passwordsService.getAllPasswords())
    }

    @PostMapping
    fun createPassword(@RequestBody @Valid request: PasswordRequest): ResponseEntity<PasswordItemDto> {
        return ResponseEntity.ok(passwordsService.createPassword(request))
    }

    @PatchMapping("/{id}")
    fun updatePassword(@PathVariable("id") id: Long, @RequestBody @Valid body: PasswordRequest): ResponseEntity<PasswordItemDto> {
        return ResponseEntity.ok(passwordsService.updatePassword(id, body))
    }

    @DeleteMapping("/{id}")
    fun deletePassword(@PathVariable("id") id: Long): ResponseEntity<Any> {
        passwordsService.deletePassword(id)
        return ResponseEntity.ok(null)
    }
}