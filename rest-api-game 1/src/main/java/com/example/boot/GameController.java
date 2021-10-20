package com.example.boot;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GameController {
	
	GameRepository repository;
	
	@GetMapping("/game")
	public List<Game> getAllGames(){
		return repository.findAll();
	}
	
	
	@GetMapping("/game/{id}")
	public Game getGameById(@PathVariable Long id) {
		return repository.getById(id);
	}
	@PostMapping("/game")
	public Game saveGame(@RequestBody Game game) {
		return repository.save(game);
	}
	
	@DeleteMapping("/game/{id}")
	public void deleteGame(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
