package com.gameCRUD.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/gameCRUD/api/GameApi;", "", "gameService", "Lcom/gameCRUD/core/GameService;", "(Lcom/gameCRUD/core/GameService;)V", "allGames", "Lio/micronaut/http/HttpResponse;", "", "Lcom/gameCRUD/core/Game;", "GameRepositoryService"})
@io.micronaut.http.annotation.Controller(value = "/api")
public final class GameApi {
    @jakarta.inject.Inject()
    private final com.gameCRUD.core.GameService gameService = null;
    
    public GameApi(@org.jetbrains.annotations.NotNull()
    com.gameCRUD.core.GameService gameService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/games")
    public final io.micronaut.http.HttpResponse<java.util.List<com.gameCRUD.core.Game>> allGames() {
        return null;
    }
}