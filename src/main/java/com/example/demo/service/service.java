package com.example.demo.service;

import java.util.Date;
import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;





@Service
public class service {
	@Autowired // creation de l'instance
	LivreRepo livreRepository;
	
	
	public void createLivre(Livre L)
	{
		livreRepository.save(L);
	}
	@OrderBy("id")
	public List<Livre> getAlllivre()
	{
		return livreRepository.findAll();
	}
	public Livre getLivre(long id)
	{
		
		return livreRepository.findById(id).orElse(null);
	}
	public Livre updateLivre( Long id,Livre livre)
	{
		Livre livreExistant = livreRepository.findById(id).orElseThrow();
		livreExistant.setAuteur(livre.getAuteur()!=null ?livre.getAuteur() : livreExistant.getAuteur());
		livreExistant.setEst_disponible(livre.getEst_disponible()!= null ?livre.getEst_disponible() : livreExistant.getEst_disponible());
		livreExistant.setNombre_page(livre.getNombre_page()!=null ?livre.getNombre_page() : livreExistant.getNombre_page());
		livreExistant.setTitre(livre.getTitre()!=null ?livre.getTitre() : livreExistant.getTitre());
		livreExistant.setDate_consultation(new Date());
		livreExistant.setDate_sortie(livre.getDate_sortie()!=null ? livre.getDate_sortie(): livreExistant.getDate_sortie());
		return livreRepository.save(livreExistant);
	}
	public void deleteLivre(Long id)
	{
		livreRepository.deleteById(id);
	}
	
	

}
