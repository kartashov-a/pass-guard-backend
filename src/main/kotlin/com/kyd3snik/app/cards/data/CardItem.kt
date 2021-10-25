package com.kyd3snik.app.cards.data

import com.kyd3snik.app.base.BaseItem
import java.time.LocalDate
import javax.persistence.Entity

@Entity
data class CardItem(
    override val name: String,
    val number: String,
    val holderName: String,
    val expirationDate: LocalDate,
    val cvc: String
) : BaseItem()
