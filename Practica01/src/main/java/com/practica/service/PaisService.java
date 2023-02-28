package com.practica.service;

import com.practica.domain.Pais;
import java.util.List;

public interface PaisService {

    public List<Pais> getPaises();

    public Pais getPais(Pais pais);

    public void savePais(Pais pais); //Para insertar o modificar - si viene el idPais o no

    public void deletePais(Pais pais);
}
