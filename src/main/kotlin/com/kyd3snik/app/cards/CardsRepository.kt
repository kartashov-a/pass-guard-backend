package com.kyd3snik.app.cards

import com.kyd3snik.app.cards.data.CardItem
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CardsRepository : CrudRepository<CardItem, Long>