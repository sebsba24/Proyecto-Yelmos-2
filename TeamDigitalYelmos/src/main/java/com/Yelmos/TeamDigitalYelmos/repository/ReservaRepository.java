package com.Yelmos.TeamDigitalYelmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yelmos.TeamDigitalYelmos.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{
	
	

}
