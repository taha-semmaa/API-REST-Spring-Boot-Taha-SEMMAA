package com.example.demo.controller;
import com.example.demo.entities.Livre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.service;
@RestController
@RequestMapping("/emsi_api/livres")
public class LivreController {
	@Autowired
	service livreService;
	@PostMapping
	public void createLivre(@RequestBody Livre L)
	{
		livreService.createLivre(L);
	}
	@GetMapping
	public List<Livre> getAll()
	{
		return livreService.getAlllivre();
	}
	@GetMapping("/{id}")
	public Livre getLivre(@PathVariable long id)
	{
		return livreService.getLivre(id);
	}
	@PutMapping("/{id}")
	public Livre updateLive(@PathVariable long id, @RequestBody Livre L)
	{
		return livreService.updateLivre(id, L);
	}
	@DeleteMapping
	public void deleteLivre(@PathVariable long id)
	{
		livreService.deleteLivre(id);
	}
	

}
