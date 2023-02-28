package com.practica.controller;

import com.practica.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class indexController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("/")
    public String inicio(Model model) {
        var clientes = clienteService.getClientes();
        model.addAttribute("listaClientes", clientes);
        return "index";
    }
}
