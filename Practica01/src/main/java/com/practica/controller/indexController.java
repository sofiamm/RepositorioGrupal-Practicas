package com.practica.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.practica.service.PaisService;

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
}
