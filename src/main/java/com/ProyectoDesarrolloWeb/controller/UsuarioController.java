package com.ProyectoDesarrolloWeb.controller;

import com.ProyectoDesarrolloWeb.Entity.Usuario;
import com.ProyectoDesarrolloWeb.Service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Arquitectura MVC");
        var usuarios = usuarioService.gUsuarios();
        model.addAttribute("usuarios",usuarios);
        return "index";
    }
    
    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario (Usuario usuario){
        
        return"UserRegister";
        
    }
    
    @PostMapping("/guardarUsuario")
    public String guardarUsuario(Usuario usuario){
        
        usuarioService.save(usuario);
        return "redirect:/";
        
    }
    
}