package com.practica.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="pais")
public class Pais implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pais;
    private String nombre_estado;
    private String capital;
    private String pobalcion;
    private String costas;

    public Pais() {
    }

    public Pais(Long id_pais, String nombre_estado, String capital, String pobalcion, String costas) {
        this.id_pais = id_pais;
        this.nombre_estado = nombre_estado;
        this.capital = capital;
        this.pobalcion = pobalcion;
        this.costas = costas;
    }
    
    
}
