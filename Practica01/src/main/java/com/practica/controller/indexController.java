package com.practica.controller;

import com.practica.domain.Pais;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.practica.service.PaisService;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class indexController {

    @Autowired
    PaisService paisService;

    @GetMapping("/")
    public String inicio(Model model) {

        var paises = paisService.getPaises();
        model.addAttribute("listaPaises", paises);
        return "index";
    }
    
    @GetMapping("/nuevoPais")
    public String nuevoCliente(Pais pais) {
        return "modificarPais";
    }

    @PostMapping("/guardarPais")
    public String guardarCliente(Pais pais) {
        paisService.savePais(pais);
        return "redirect:/";
    }

    @GetMapping("/modificarPais/{idPais}")
    public String modificarCliente(Pais pais, Model model) {
        pais = paisService.getPais(pais);
        model.addAttribute("pais", pais);
        return "modificarPais";
    }

    @GetMapping("/eliminarPais{idPais}")
    public String eliminarCliente(Pais pais) {
        paisService.deletePais(pais);
        return "redirect:/";
    }
}
