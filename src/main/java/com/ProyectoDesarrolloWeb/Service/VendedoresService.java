/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrolloWeb.Service;

import com.ProyectoDesarrolloWeb.Entity.Vendedores;
import com.ProyectoDesarrolloWeb.dao.VendedoresDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kybz
 */

@Service

public class VendedoresService implements IVendedoresService{
    
    @Autowired
    private VendedoresDao vendedoresDao;

    @Override
    @Transactional(readOnly= true)
    public List<Vendedores> getVendedores() {
        
        return(List<Vendedores>) vendedoresDao.findAll();

    }

    @Override
    @Transactional
    public void save(Vendedores vendedores) {
        
        vendedoresDao.save(vendedores);

    }

    @Override
    @Transactional
    public void delete(Vendedores vendedores) {

        vendedoresDao.delete(vendedores);
        
    }

    @Override
    @Transactional(readOnly= true)
    public Vendedores getVendedor(Vendedores vendedores) {
        
        return vendedoresDao.findById(vendedores.getIdVendedor()).orElse(null);

    }
    
}
