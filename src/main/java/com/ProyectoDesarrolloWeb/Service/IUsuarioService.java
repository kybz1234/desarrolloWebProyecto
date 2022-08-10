package com.ProyectoDesarrolloWeb.Service;

import com.ProyectoDesarrolloWeb.Entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public List<Usuario> gUsuarios();
    public void save(Usuario usuario);
    public void delete(Usuario usuario);
    public Usuario gUsuario(Usuario usuario);
}