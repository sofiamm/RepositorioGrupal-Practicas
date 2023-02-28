package com.practica.service;



import com.practica.dao.PaisDao;
import com.practica.domain.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    PaisDao PaisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> getPaises() {
        return (List<Pais>) PaisDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pais getPais(Pais pais) {
        return PaisDao.findById(Pais.getIdPais()).orElse(null);
    }

    @Override
    @Transactional
    public void saveCliente(Pais pais) {
        PaisDao.save(pais);
    }

    @Override
    @Transactional
    public void deleteCliente(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }

 
    }

  
    

