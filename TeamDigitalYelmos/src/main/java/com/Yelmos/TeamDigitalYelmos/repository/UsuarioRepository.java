package com.Yelmos.TeamDigitalYelmos.repository;

import org.springframework.stereotype.Repository;

import com.Yelmos.TeamDigitalYelmos.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	

}
