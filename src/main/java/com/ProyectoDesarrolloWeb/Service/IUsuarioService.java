/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoDesarrolloWeb.Service;

import com.ProyectoDesarrolloWeb.Entity.Usuario;
import java.util.List;

/**
 *
 * @author Kybz
 */
public interface IUsuarioService {
    
    public List<Usuario> gUsuarios();
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
    
    public Usuario gUsuario(Usuario usuario);
    
    
}
