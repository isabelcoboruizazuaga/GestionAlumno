/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
public class AlumnoAD implements Serializable {
private int nMatricula;
private String nombre;
private float not1Ev, nota2Ev, notaFinal, notaExtra;
public AlumnoAD(){
nMatricula = Integer.MIN_VALUE;
nombre = null;
not1Ev = nota2Ev = notaFinal = notaExtra = 0;
}
public AlumnoAD (int nMatricula, String nombre, float not1Ev, float nota2Ev,
float notaFinal, float notaExtra){
this.nMatricula = nMatricula;
this.nombre = nombre;
this.not1Ev = not1Ev;
this.nota2Ev = nota2Ev;
this.notaFinal = notaFinal;
this.notaExtra = notaExtra;
}
public void setNMatricula(int nMatricula){this.nMatricula=nMatricula;}
public void setNombre(String nombre){this.nombre=nombre;}
public void setNot1Ev(float not1Ev){this.not1Ev=not1Ev;}
public void setNota2Ev(float nota2Ev){this.nota2Ev=nota2Ev;}
public void setNotaFinal(float notaFinal){this.notaFinal=notaFinal;}
public void setNotaExtra(float notaExtra){this.notaExtra=notaExtra;}
public int getNMatricula(){ return this.nMatricula;}
public String getNombre(){ return this.nombre;}
public float getNot1Ev(){ return this.not1Ev;}
public float getNota2Ev(){ return this.nota2Ev;}
public float getNotaFinal(){ return this.notaFinal;}
public float getNotaExtra(){ return this.notaExtra;}
}
