package com.practica.service;

import com.practica.dao.PaisDao;
import com.practica.domain.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaisServiceImpl {

    @Autowired
    PaisDao paisDao;

    @Override
    public String toString() {
        return "PaisServiceImpl{" + "paisDao=" + paisDao + '}';
    }

    @Transactional(readOnly = true)
    public List<Pais> getPaises() {
        return (List<Pais>) paisDao.findAll();
    }

    @Transactional(readOnly = true)
    public Pais getPais(Pais pais) {
        return paisDao.findById(pais.getIdPais()).orElse(null);
    }

    @Transactional
    public void saveCliente(Pais pais) {
        paisDao.save(pais);
    }

    @Transactional
    public void deleteCliente(Pais pais) {
        paisDao.deleteById(pais.getIdPais());
    }
}
