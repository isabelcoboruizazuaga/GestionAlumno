/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.AlumnoAD;
import Vistas.VentanaPrincipal;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

    ArrayList<AlumnoAD> alumnos = new ArrayList<AlumnoAD>();
    String ruta = "alumnos.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);

        ventanaPrincipal.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                
            }
        });

    }

    public ArrayList<AlumnoAD> iniciar() {
        ArrayList<AlumnoAD> alumn = new ArrayList<AlumnoAD>();
        File fichero = new File(ruta);

        try {
            //Si el fichero no existe lo creo
            if (!fichero.exists()) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(ruta)));
                oos.writeObject(alumnos);

                oos.close();
            }
        } catch (IOException ex) {
            System.out.println("La ruta no existe, remalardo");

        }
        //Cuando el fichero exista seguro lo leo
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(ruta)));

            try {
                alumn = (ArrayList<AlumnoAD>) ois.readObject();

            } catch (ClassNotFoundException exc) {
                System.out.println("patata");

            } catch (EOFException ex) {
                System.out.println("puta");
            }

        } catch (IOException ex) {
            System.out.println("No existe el archivo");
        }
        
        //Devuelve la lista de alumnos obtenida en la lectura
        return alumn;
    }
    
    public void escribir(){
        ArrayList<AlumnoAD> alumn = new ArrayList<AlumnoAD>();
        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(ruta)));
            //Se escriben los alumnos del array principal (el cual se mantiene actualizado)
            oos.writeObject(alumnos);

            oos.close();

        } catch (IOException ex) {
            System.out.println("La ruta no existe, remalardo");

        }
    }
}
