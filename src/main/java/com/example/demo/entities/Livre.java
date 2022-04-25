package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name="Livre")
@Data @AllArgsConstructor @NoArgsConstructor
public class Livre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length=50,nullable=false)
	private String titre;
	 
	@Column(nullable=false,updatable=false)
	private String maison_idition;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date date_sortie;
	
	@Column(nullable=false)
	private String auteur;
	
	@Column(nullable=false)
	private Integer nombre_page;
	
	@Column(unique=true,nullable=false,updatable = false)
	private String isbm;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
	private Date date_consultation;
	
	@Column(nullable=false)
	private Boolean est_disponible;
}
