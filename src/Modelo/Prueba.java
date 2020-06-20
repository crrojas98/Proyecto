
package Modelo;

import estructuras.Cola;
import estructuras.Lista_Enlazada;


public class Prueba {
    private int tipo; // tipo 1: falso o verdader, tipo 2: opcion multiple, tipo 3: pregunta abierta.
    private Cola preguntas;
    private int n_preguntas;
    private int n_opciones;
    
    
    public Prueba (int n_preguntas, int n_opciones){
        this.tipo = tipo;
        this.n_preguntas = n_preguntas;
        this.n_opciones = n_opciones;
        preguntas = new Cola (pregunta.class, n_preguntas);
    }
    
    public void addPreguntas(String pregunta, Lista_Enlazada<String> opciones){
        pregunta nueva_pregunta = new pregunta(tipo, pregunta, opciones);
        preguntas.push(nueva_pregunta);
    }
    
    
}
