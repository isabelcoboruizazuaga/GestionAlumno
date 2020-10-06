/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.AlumnoAD;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import Vistas.VentanaPrincipal;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author isabe
 */
public class Escritor {
VentanaPrincipal ventanaPrincipal;
ArrayList<AlumnoAD> alumnos;
String ruta;


    public Escritor(VentanaPrincipal ventanaPrincipal, ArrayList<AlumnoAD> alumnos, String ruta) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.alumnos = alumnos;
        this.ruta = ruta;
    }
    
    
    public void escribir(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(ruta)));
            
            try{
            AlumnoAD al = ventanaPrincipal.getAlumno();
            alumnos.add(al);
            }catch (NullPointerException e){
            }
            oos.writeObject(alumnos);
            
            oos.close();
        } catch (IOException ex) {
            System.out.println("La ruta no existe, remalardo");

        }
    }

}
