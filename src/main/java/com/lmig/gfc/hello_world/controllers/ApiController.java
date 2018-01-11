package com.lmig.gfc.hello_world.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.hello_world.models.Hero;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	private ArrayList<Hero> heroList = new ArrayList<Hero>();
	
	public ApiController() {
		Hero hero1 = new Hero("Peter", "Parker", "Spiderman");
		Hero hero2 = new Hero("Bruce", "Wayne", "Batman");
		Hero hero3 = new Hero("Some", "Lady", "SuperWoman");
		Hero hero4 = new Hero("Bruce", "Banner", "Hulk");
		
		this.heroList.add(hero1);
		this.heroList.add(hero2);
		this.heroList.add(hero3);
		this.heroList.add(hero4);
		
	}
	
	
	//this is a GET request for all heros in the api.
	@GetMapping("/hero")
	public ArrayList<Hero> getHero() {
		return this.heroList;
	}
	
	
	//this is a GET request for a specific hero
	@GetMapping("/hero/{id}")
	public Hero getSpecificHero(@PathVariable Integer id) {
		return this.heroList.get(id);
	}

	
	//create a new hero
	@PostMapping("/hero")
	public Hero postHero(@RequestBody Hero hero) {
		this.heroList.add(hero);
		return hero;
	}
	
	
	//PUT is used to update a hero
	@PutMapping("/hero/{id}")
	public Hero putHero(@PathVariable Integer id, @RequestBody Hero hero) {
		this.heroList.set(id, hero);
		return this.heroList.get(id);
	}
	
	
	//DELETE a hero
	@DeleteMapping("/hero/{id}")
	public Hero deleteHero(@PathVariable Integer id) {
		Hero removedHero = this.heroList.get(id);
		this.heroList.remove(removedHero);
		return removedHero;
	}
	
	
}
