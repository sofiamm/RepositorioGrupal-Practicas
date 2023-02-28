package com.practica.dao;

import com.practica.domain.Pais;
import org.springframework.data.repository.CrudRepository;

public interface PaisDao extends CrudRepository<Pais, Long> {
    
}
