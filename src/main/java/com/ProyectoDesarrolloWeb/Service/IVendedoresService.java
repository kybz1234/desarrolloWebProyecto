/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoDesarrolloWeb.Service;

import com.ProyectoDesarrolloWeb.Entity.Vendedores;
import java.util.List;

/**
 *
 * @author Kybz
 */
public interface IVendedoresService {
    
   public List<Vendedores> getVendedores();
   
   public void save (Vendedores vendedores);
   
   public void delete(Vendedores vendedores);
   
   public Vendedores getVendedor(Vendedores vendedores);
}
