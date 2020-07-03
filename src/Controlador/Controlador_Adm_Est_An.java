
package Controlador;

import Modelo.*;
import Vista.Vista;
import Vista.Vista_Admin_An;
import Vista.Vista_Admin_E;
import estructuras.Lista_Enlazada;
import estructuras.TableHash;
import estructuras.arbol;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Controlador_Adm_Est_An {

    arbol cuentas;
    Vista_Admin_An vista;
    private boolean flag, error;
    TableHash tabladatest;
    public Controlador_Adm_Est_An() {
        this.vista = new Vista_Admin_An();
        this.vista.getBtValidar().setOnAction(new EventoValidar());
        this.vista.getBtRegresar().setOnAction(new EventoRegresar());
        flag = true;
        error = false;
    }

    public Vista_Admin_An getVista() {
        return vista;
    }

    private class EventoValidar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Listas lista = new Listas(1);
            cuentas = lista.getCuentas();
            registrar(tabladatest);
        }
        
        private void registrar(TableHash tabladatest) {
            Vista_Admin_An persona= new Vista_Admin_An();
            
            String Id=persona.getTfID().getText();
            String Nombre=persona.getTfNombres().getText();
            String Apellido=persona.getTfApellidos().getText();
            String Usuario=persona.getTfUser().getText();
            String Correo=persona.getTfCorreo().getText();
            String Contraseña= new String(persona.getTfConfContra().getText());
            
            tabladatest.insertar(Id, Nombre, Apellido, Usuario, Correo, Contraseña);
                      
            
            
        }
    }

    private class EventoRegresar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Controlador_Admin_Est controlador;
            controlador = new Controlador_Admin_Est();
            Vista vista = controlador.getVista();
            Singleton singleton = Singleton.getSingleton();
            Stage stage = singleton.getStage();
            stage.setScene(vista.getScena());
            stage.setTitle("ADMINISTRADOR");
            stage.show();

        }

    }
}