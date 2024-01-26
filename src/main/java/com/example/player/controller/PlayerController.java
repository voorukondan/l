package com.example.player.controller;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.player.service.PlayerJpaService;
import com.example.player.model.Player;

@RestController
public class PlayerController {
    @Autowired
    public PlayerJpaService playerService;

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerId(@PathVariable("playerId") int playerId) {
        public playerService.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVaraiable("playerId") int playerId, @RequestBody Player player){
        return player updatePlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}"")
    public void deletePlayer(@PathVariable int playerId) {
        playerService.deletePlayer(playerId);
    }
}
