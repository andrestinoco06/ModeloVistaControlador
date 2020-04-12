package edu.unicundi.modelo;

import java.util.List;

/**
 *  Clase Modelo para implementar la arquitectura de software MVC
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Modelo {
    
    /**
     * Variavle de tipo String para almacenar los mensajes
     */
    private String mensaje;
    
    /**
     * Constructor principal para inicializar la variable mensaje
     * @param mensaje 
     */
    public Modelo(String mensaje){
        this.mensaje = mensaje;
    }
    
    /**
     * Constructor vacío
     */
    public Modelo(){
        
    }
            
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
