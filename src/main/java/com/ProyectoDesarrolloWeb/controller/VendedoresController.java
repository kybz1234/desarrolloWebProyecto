/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrolloWeb.controller;

import com.ProyectoDesarrolloWeb.Service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Kybz
 */


@Controller
@Slf4j

public class VendedoresController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Vendedores controller");
        var usuarios = usuarioService.gUsuarios();
        model.addAttribute("usuarios",usuarios);
        return "index";
    }
    
}
