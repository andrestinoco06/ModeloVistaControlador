package edu.unicundi.principal;

import edu.unicundi.controlador.Controlador;
import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;

/**
 *  Clase principal para ejecutar el programa
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Main {
    
    /**
     * Metodo Main para ejecutar el programa.
     * @param args 
     */
    public static void main(String args[]) {
        
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        
        Controlador control = new Controlador(modelo, vista);
        vista.setVisible(true);
    }
}
