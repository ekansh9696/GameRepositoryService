package com.gameCRUD.core

import java.time.LocalDate

data class Game(
    val id : Int,
    val name : String,
    val url : String,
    val author : String,
    val publishedOn : LocalDate
)
