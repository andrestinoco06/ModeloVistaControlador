package edu.unicundi.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;
import javax.swing.DefaultListModel;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Controlador implements ActionListener {
    
    private Modelo modelo;
    private Vista vista;   
    
    public Controlador(){
        
    }
    
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.B_Ingresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        modelo = new Modelo(vista.TF_Ingresar.getText());
        DefaultListModel list = new DefaultListModel();
        list.addElement(modelo.getMensaje());
        vista.L_Mostrar.setModel(list);
    }
}
