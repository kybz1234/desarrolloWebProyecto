package com.ProyectoDesarrolloWeb.dao;

import com.ProyectoDesarrolloWeb.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario,Long> {}