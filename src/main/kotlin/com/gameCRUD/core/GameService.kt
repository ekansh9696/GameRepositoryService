package com.gameCRUD.core

import jakarta.inject.Singleton
import java.time.LocalDate

@Singleton
class GameService() {

    fun allGames() : List<Game>{
        return listOf(Game(1,"placeholder game", "placeholder url","placeholder Author", LocalDate.of(2022,12,5)))
    }
}