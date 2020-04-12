package edu.unicundi.modelo;

import java.util.List;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Modelo {
    
    private String mensaje;
    
    public Modelo(String mensaje){
        this.mensaje = mensaje;
    }
    
    public Modelo(){
        
    }
            
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
