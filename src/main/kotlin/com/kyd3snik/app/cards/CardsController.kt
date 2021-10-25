package com.kyd3snik.app.cards

import com.kyd3snik.app.cards.data.CardItemDto
import com.kyd3snik.app.cards.data.CardRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/cards")
class CardsController(
    val cardsService: CardsService
) {

    @GetMapping
    fun getAllCards(): ResponseEntity<List<CardItemDto>> {
        return ResponseEntity.ok(cardsService.getAllCards())
    }

    @PostMapping
    fun createCard(@RequestBody @Valid request: CardRequest): ResponseEntity<CardItemDto> {
        return ResponseEntity.ok(cardsService.createCard(request))
    }

    @PatchMapping("/{id}")
    fun updateCard(@PathVariable("id") id: Long, @RequestBody @Valid body: CardRequest): ResponseEntity<CardItemDto> {
        return ResponseEntity.ok(cardsService.updateCard(id, body))
    }

    @DeleteMapping("/{id}")
    fun deleteCard(@PathVariable("id") id: Long): ResponseEntity<Any> {
        cardsService.deleteCard(id)
        return ResponseEntity.ok(null)
    }
}