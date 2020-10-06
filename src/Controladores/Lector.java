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
import java.io.IOException;
/**
 *
 * @author isabe
 */
public class Lector {
VentanaPrincipal ventanaPrincipal;
ArrayList<AlumnoAD> destino;
String ruta;

    public ArrayList<AlumnoAD> getDestino() {
        return destino;
    }

    public void setDestino(ArrayList<AlumnoAD> destino) {
        this.destino = destino;
    }

    public Lector(VentanaPrincipal ventanaPrincipal, String ruta) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.ruta = ruta;
    }
    
    
    public void leer(){
        

        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(ruta)));

            try {

                destino = (ArrayList<AlumnoAD>) ois.readObject();
                for (int i = 0; i < destino.size(); i++) {

                    Object alumno = destino.get(i);
                    if (alumno instanceof AlumnoAD) {
                        ventanaPrincipal.cargarTabla((AlumnoAD)alumno);
                    }
                }

            } catch (ClassNotFoundException exc) {
                System.out.println("patata");

                ois.close();
            } catch (EOFException ex) {
                System.out.println("puta");
            }
            
        } catch (IOException ex) {
            System.out.println("No existe el archivo");
        }
    }
}
