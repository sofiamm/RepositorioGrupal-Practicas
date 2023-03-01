package com.practica01.controller;

import com.practica01.domain.Pais;
import com.practica01.service.PaisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String nuevoPais(Pais pais) {
        return "modificarPais";
    }

    @PostMapping("/guardarPais")
    public String guardarPais(Pais pais) {
        paisService.savePais(pais);
        return "redirect:/";
    }

    @GetMapping("/modificarPais/{idPais}")
    public String modificarPais(Pais pais, Model model) {
        pais = paisService.getPais(pais);
        model.addAttribute("pais", pais);
        return "modificarPais";
    }

    @GetMapping("/eliminarPais/{idPais}")
    public String eliminarPais(Pais pais) {
        paisService.deletePais(pais);
        return "redirect:/";
    }
}
