package com.Yelmos.TeamDigitalYelmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yelmos.TeamDigitalYelmos.model.Despacho;

@Repository
public interface DespachoRepository extends JpaRepository<Despacho, Long> {

}
