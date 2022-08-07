/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrolloWeb.Service;

import com.ProyectoDesarrolloWeb.Entity.Usuario;
import com.ProyectoDesarrolloWeb.dao.UsuarioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kybz
 */

@Service

public class UsuarioService implements IUsuarioService {
    
    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> gUsuarios() {
        
        return (List<Usuario>) usuarioDao.findAll();

    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        
        usuarioDao.save(usuario);

    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {

        usuarioDao.delete(usuario);
        
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario gUsuario(Usuario usuario) {

        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
        
    }
    
}
