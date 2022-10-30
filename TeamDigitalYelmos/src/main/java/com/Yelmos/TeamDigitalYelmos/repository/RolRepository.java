package com.Yelmos.TeamDigitalYelmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yelmos.TeamDigitalYelmos.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
