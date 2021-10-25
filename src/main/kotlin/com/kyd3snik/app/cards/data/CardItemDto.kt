package com.kyd3snik.app.cards.data

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class CardItemDto(
    val id: Long,
    val name: String,
    val number: String,
    val holderName: String,
    @JsonFormat(pattern = "dd.MM.yyyy")
    val expirationDate: LocalDate,
    val cvc: String
)

fun CardItem.toDto() = CardItemDto(id, name, number, holderName, expirationDate, cvc)