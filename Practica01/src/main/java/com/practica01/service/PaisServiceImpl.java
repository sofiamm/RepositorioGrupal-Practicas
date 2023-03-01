package com.practica01.service;

import com.practica01.dao.PaisDao;
import com.practica01.domain.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    PaisDao paisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> getPaises() {
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pais getPais(Pais pais) {
        return paisDao.findById(pais.getIdPais()).orElse(null);
    }

    @Override
    @Transactional
    public void savePais(Pais pais) {
        paisDao.save(pais);
    }

    @Override
    @Transactional
    public void deletePais(Pais pais) {
        paisDao.deleteById(pais.getIdPais());
    }

}
