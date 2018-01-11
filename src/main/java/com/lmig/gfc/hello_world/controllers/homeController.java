package com.lmig.gfc.hello_world.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.hello_world.models.Hero;

@Controller

public class homeController {
	
	private Hero hero;
	
	public homeController() {
		this.hero = new Hero("clark", "kent", "superman");
	}
	
	@RequestMapping("/dynamic/{name}")
	
	public ModelAndView anotherPage(@PathVariable String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("favoriteColor", "green");
		mv.setViewName("home");
		return mv;
	}
	
@RequestMapping("/michael")
	
	public ModelAndView michaelPage() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("michael");
		return mv;
	}

@RequestMapping("/hero")

public ModelAndView heroPage() {
	
	ModelAndView mv = new ModelAndView();
	mv.addObject("myHero", this.hero);
	mv.setViewName("hero");
	return mv;
}
}
