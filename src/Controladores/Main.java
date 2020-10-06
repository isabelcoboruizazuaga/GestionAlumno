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

        String ruta = "algo.txt";

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(ruta)));

            ArrayList<AlumnoAD> alumnos = new ArrayList<AlumnoAD>();
            AlumnoAD unAlumno = new AlumnoAD(1, "Pablo", 9, 8, 9, 1);
            alumnos.add(unAlumno);

            AlumnoAD a = new AlumnoAD(1, "Pedro", 2, 3, 4, 0);
            alumnos.add(a);

            AlumnoAD b = new AlumnoAD(1, "Pepe", 5, 6, 5, 5);
            alumnos.add(b);
            
            AlumnoAD al = ventanaPrincipal.getAlumno();
            alumnos.add(al);
            System.out.println("29");
            oos.writeObject(alumnos);

            oos.close();
        } catch (IOException ex) {
            System.out.println("La ruta no existe, remalardo");

        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(ruta)));

            try {

                ArrayList<AlumnoAD> destino = (ArrayList<AlumnoAD>) ois.readObject();
                for (int i = 0; i < destino.size(); i++) {

                    Object alumno = destino.get(i);
                    if (alumno instanceof AlumnoAD) {
                        ventanaPrincipal.cargarTabla((AlumnoAD)alumno);
                    }
                }

            } catch (ClassNotFoundException exc) {
                System.out.println("patata");

            } catch (EOFException ex) {
                System.out.println("puta");
            }

//        try {
//            FileInputStream in= new FileInputStream("input.txt");
//
//            
////        ventanaPrincipal.set (new WindowsAdpter()){
////        onClosing(){
////            guardarArrayListenFichero;
////        }
////        onOpening(){
////            cargarListaAlumnosDesdeFichero();
////        }
////    }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
            
            
        } catch (IOException ex) {
            System.out.println("No existe el archivo");
        }
      }
    
    public void  guardarArrayListenFichero(){}
    public void cargarListaAlumnosDesdeFichero(){}
    
}
