package com.ProyectoDesarrolloWeb.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="vendedores")

public class Vendedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVendedor;
    private String nombre, apellido, correo, password, nombreTienda, descTienda;

    
    public Vendedores() {
    }
    
    

    public Vendedores(Long idVendedor, String nombre, String apellido, String correo, String password, String nombreTienda, String descTienda) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.nombreTienda = nombreTienda;
        this.descTienda = descTienda;
    }
    
    
    
}
