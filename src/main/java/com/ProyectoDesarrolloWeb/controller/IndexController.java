package com.ProyectoDesarrolloWeb.controller;

import com.ProyectoDesarrolloWeb.dao.UsuarioDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    private UsuarioDao usuariodao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Arquitectura MVC");
        var usuarios = usuariodao.findAll();
        model.addAttribute("usuarios",usuarios);
        return "index";
    }
}