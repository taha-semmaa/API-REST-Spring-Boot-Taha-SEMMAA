package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Livre;


@Repository
public interface LivreRepo extends JpaRepository<Livre,Long>{

}
