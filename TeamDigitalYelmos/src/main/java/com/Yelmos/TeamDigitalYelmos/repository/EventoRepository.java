package com.Yelmos.TeamDigitalYelmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yelmos.TeamDigitalYelmos.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}
