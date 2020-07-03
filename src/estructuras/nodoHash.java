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
    String id;
    String nombre;
    String apellido;
    String Usuario;
    String correo;
    String contraseña;

    public nodoHash(String id, String nombre, String apellido, String Usuario, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Usuario = Usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    
    
}
