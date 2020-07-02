/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author Cristian
 */
public class nodoHash {
    char estado;
    String NombreVariable;
    String tipo;
    String ambito;
    String valor;

    public nodoHash(String NombreVariable, String tipo, String valor, String ambito) {
        
        this.NombreVariable = NombreVariable;
        this.tipo = tipo;
        this.valor = valor;
        this.ambito=ambito;
    }
    
}
