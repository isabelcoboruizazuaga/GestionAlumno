/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.AlumnoAD;
import Vistas.VentanaPrincipal;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
        String ruta = "algo1.txt";
        
        File file= new File(ruta);
        
        Lector lector= new Lector(ventanaPrincipal, ruta);
        lector.leer();
        
        
        
        Escritor escritor= new Escritor(ventanaPrincipal, lector.getDestino(),ruta);
        escritor.escribir();
        
        while(ventanaPrincipal.getAlumno() ==null){
        escritor.escribir();
    }
        
        
        
        lector.leer();
        
        

        
//        while(true){
//            AlumnoAD al = ventanaPrincipal.getAlumno();
//            alumnos.add(al);
//        }
      }
    
    public void  guardarArrayListenFichero(){}
    public void cargarListaAlumnosDesdeFichero(){}
    
}
