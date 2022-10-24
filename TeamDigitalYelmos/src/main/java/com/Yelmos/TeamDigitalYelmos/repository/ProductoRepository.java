package com.Yelmos.TeamDigitalYelmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
