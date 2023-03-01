package com.practica.service;

import com.practica.domain.Pais;
import java.util.List;

public interface PaisService {

    public List<Pais> getPaises();

    public Pais getPais(Pais pais);

    public void savePais(Pais pais);

    public void deletePais(Pais pais);
}
