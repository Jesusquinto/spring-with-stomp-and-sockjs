
package com.example.demo.models.documents;

import java.io.Serializable;


public class Mensaje implements Serializable{
    
    private String texto;
    private Long fecha;
    private String usuario;
    private String tipo;
      
    public String getTexto() {
        return texto;
    }

 
    public Long getFecha() {
        return fecha;
    }

   
    public void setTexto(String texto) {
        this.texto = texto;
    }

  
    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }
    
    private static final long serialVersionUID = -3777582564067492550L;

  
    public String getUsuario() {
        return usuario;
    }

 
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

  
    public String getTipo() {
        return tipo;
    }

   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
