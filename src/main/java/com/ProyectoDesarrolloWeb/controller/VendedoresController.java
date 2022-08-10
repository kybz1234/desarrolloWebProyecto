/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrolloWeb.controller;

import com.ProyectoDesarrolloWeb.Entity.Vendedores;
import com.ProyectoDesarrolloWeb.Service.VendedoresService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kybz
 */


@Controller
@Slf4j

public class VendedoresController {
    
    @Autowired
    private VendedoresService vendedoresService;
    
    @GetMapping("/listaVendedores")
    public String inicio(Model model) {
        log.info("vendedores controller");
        var vendedores = vendedoresService.getVendedores();
        model.addAttribute("vendedores",vendedores);
        return "index";
    }
    
    @GetMapping("/nuevoVendedor")
    public String nuevoVendedor (Vendedores vendedores){
        
        return"sellerRegister";
    }
    
    @PostMapping("/guardarVendedor")
    public String guardarVendedor(Vendedores vendedores){
        
        vendedoresService.save(vendedores);
        return "redirect:/";
    }
    
}
