package edu.unicundi.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;
import javax.swing.DefaultListModel;

/**
 *  Clase Controlador para implementar la arquitectura de software MVC
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Controlador implements ActionListener {
    
    /**
     * Variable de tipo Modelo para acceder a los métodos de la clase.
     */
    private Modelo modelo;
    
    /**
     * Variable de tipo Vista para acceder a los métodos de la clase.
     */
    private Vista vista;   
    
    /**
     * Constructor vacío
     */
    public Controlador(){
        
    }
    
    /**
     * Constructor principal para inicializar las variables
     * @param modelo
     * @param vista 
     */
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.B_Ingresar.addActionListener(this);
    }
    
    /**
     * Método que se acciona al presionarse el botón, ingresa datos a una lista y los muestra.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e){
        modelo = new Modelo(vista.TF_Ingresar.getText());
        DefaultListModel list = new DefaultListModel();
        list.addElement(modelo.getMensaje());
        vista.L_Mostrar.setModel(list);
    }
}
