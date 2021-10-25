package com.kyd3snik.app.cards

import com.kyd3snik.app.base.error.errorNotFound
import com.kyd3snik.app.cards.data.*
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CardsService(
    private val repository: CardsRepository
) {

    fun getAllCards(): List<CardItemDto> {
        return repository.findAll().map(CardItem::toDto)
    }

    fun createCard(card: CardRequest): CardItemDto {
        return repository.save(card.toEntity()).toDto()
    }

    fun updateCard(id: Long, card: CardRequest): CardItemDto {
        requireCard(id)
        return repository.save(card.toEntity()).toDto()
    }

    fun deleteCard(id: Long) {
        requireCard(id)
        repository.deleteById(id)
    }

    private fun requireCard(id: Long) {
        repository.findByIdOrNull(id) ?: errorNotFound("Card")
    }
}