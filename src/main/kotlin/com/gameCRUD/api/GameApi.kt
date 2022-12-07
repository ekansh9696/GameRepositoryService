package com.gameCRUD.api

import com.gameCRUD.core.Game
import com.gameCRUD.core.GameService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@Controller(value="/api")
class GameApi(@Inject private val gameService : GameService) {

    @Get("/games")
    fun allGames() : HttpResponse<List<Game>> {
        return HttpResponse.ok(gameService.allGames())
    }
}