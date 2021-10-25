package com.kyd3snik.app.cards.data

import java.time.LocalDate
import javax.validation.constraints.NotEmpty

data class CardRequest(
    @NotEmpty(message = "Название не можеть быть пустым")
    val name: String,
    @NotEmpty(message = "Номер карты не можеть быть пустым")
    val number: String,
    @NotEmpty(message = "Не верная дата окончания действия карты")
    val expirationDate: LocalDate,
    @NotEmpty(message = "Имя владельца не можеть быть пустым")
    val holderName: String,
    @NotEmpty(message = "Cvc-код не можеть быть пустым")
    val cvc: String
)

fun CardRequest.toEntity() = CardItem(name, number, holderName, expirationDate, cvc)
