package com.ProyectoDesarrolloWeb.dao;

import com.ProyectoDesarrolloWeb.Entity.Vendedor;
import org.springframework.data.repository.CrudRepository;

public interface VendedorDao extends CrudRepository<Vendedor,Long> {}