/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrador
 */
public class BaseFXMLController implements Initializable {
    
    @FXML
    private TextField pantalla;
    @FXML
    private Button n1;
    @FXML
    private Button n2;
    @FXML
    private Button n3;
    @FXML
    private Button suma;
    @FXML
    private Button n4;
    @FXML
    private Button n5;
    @FXML
    private Button n6;
    @FXML
    private Button resta;
    @FXML
    private Button n7;
    @FXML
    private Button n8;
    @FXML
    private Button n9;
    @FXML
    private Button multiplicacion;
    @FXML
    private Button n0;
    @FXML
    private Button opuesto;
    @FXML
    private Button division;
    @FXML
    private Button borrar;
    @FXML
    private Button eliminar;
    @FXML
    private Button inverso;
    @FXML
    private Button igual;
    
    String num1="";
    String numero1="";
    String numero2="";
    String operacion;
    int cuenta=0;
    
            
    @FXML
    private void handleButtonActionn1(ActionEvent event) {

        int conteo=0;
        char numboton = '1';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
        
    }   

    @FXML
    private void handleButtonActionn2(ActionEvent event) {
        int conteo=0;
        char numboton = '2';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
    }

    @FXML
    private void handleButtonActionn3(ActionEvent event) {
        int conteo=0;
        char numboton = '3';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
    }

    @FXML
    private void handleButtonActionsuma(ActionEvent event) {
        int conteo=0;
        String numboton = " + ";
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
        cuenta++;
        if(cuenta >=2){
            String[] split = operacion.split(" "); 
            String conversion1, conversion2, conversion3, conversion4; 

            int a = Integer.valueOf(split[0]);
            int b = Integer.valueOf(split[2]);
            int sumares = a+b;
            int restares = a-b;
            int multires = a*b;
            int divires = a/b;
        
            conversion1 = Integer.toString(sumares);
            conversion2 = Integer.toString(restares);
            conversion3 = Integer.toString(multires);
            conversion4 = Integer.toString(divires);

            String operador = split[1];
            switch(operador){
                case "+" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion1;
                break;
                case "-" : 
                    pantalla.setText(conversion2);
                    numero1 = conversion2;
                break;
                case "*" : 
                    pantalla.setText(conversion3);
                    numero1 = conversion3;
                break;
                case "/" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion4;
                break;
                default : pantalla.setText("~~~~OPERACION INVALIDA~~~~");
            }
            numero1= numero1 + numboton;
            numero2 = "";
        }

    }

    @FXML
    private void handleButtonActionn4(ActionEvent event) {
        int conteo=0;
        char numboton = '4';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
    }

    @FXML
    private void handleButtonActionn5(ActionEvent event) {
        int conteo=0;
        char numboton = '5';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
    }

    @FXML
    private void handleButtonActionn6(ActionEvent event) {
        int conteo=0;
        char numboton = '6';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }

    }

    @FXML
    private void handleButtonActionresta(ActionEvent event) {
        int conteo=0;
        String numboton = " - ";
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
        cuenta++;
        if(cuenta >=2){
            String[] split = operacion.split(" "); 
            String conversion1, conversion2, conversion3, conversion4; 

            int a = Integer.valueOf(split[0]);
            int b = Integer.valueOf(split[2]);
            int sumares = a+b;
            int restares = a-b;
            int multires = a*b;
            int divires = a/b;
        
            conversion1 = Integer.toString(sumares);
            conversion2 = Integer.toString(restares);
            conversion3 = Integer.toString(multires);
            conversion4 = Integer.toString(divires);

            String operador = split[1];
            switch(operador){
                case "+" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion1;
                break;
                case "-" : 
                    pantalla.setText(conversion2);
                    numero1 = conversion2;
                break;
                case "*" : 
                    pantalla.setText(conversion3);
                    numero1 = conversion3;
                break;
                case "/" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion4;
                break;
                default : pantalla.setText("~~~~OPERACION INVALIDA~~~~");
            }
            numero1= numero1 + numboton;
            numero2 = "";
        }
    }

    @FXML
    private void handleButtonActionn7(ActionEvent event) {
        int conteo=0;
        char numboton = '7';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }

    }

    @FXML
    private void handleButtonActionn8(ActionEvent event) {
        int conteo=0;
        char numboton = '8';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }

    }

    @FXML
    private void handleButtonActionn9(ActionEvent event) {
        int conteo=0;
        char numboton = '9';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }

    }

    @FXML
    private void handleButtonActionmultiplicacion(ActionEvent event) {
        int conteo=0;
        String numboton = " * ";
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
        cuenta++;
        if(cuenta >=2){
            String[] split = operacion.split(" "); 
            String conversion1, conversion2, conversion3, conversion4; 

            int a = Integer.valueOf(split[0]);
            int b = Integer.valueOf(split[2]);
            int sumares = a+b;
            int restares = a-b;
            int multires = a*b;
            int divires = a/b;
        
            conversion1 = Integer.toString(sumares);
            conversion2 = Integer.toString(restares);
            conversion3 = Integer.toString(multires);
            conversion4 = Integer.toString(divires);

            String operador = split[1];
            switch(operador){
                case "+" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion1;
                break;
                case "-" : 
                    pantalla.setText(conversion2);
                    numero1 = conversion2;
                break;
                case "*" : 
                    pantalla.setText(conversion3);
                    numero1 = conversion3;
                break;
                case "/" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion4;
                break;
                default : pantalla.setText("~~~~OPERACION INVALIDA~~~~");
            }
            numero1= numero1 + numboton;
            numero2 = "";
        }
    }

    @FXML
    private void handleButtonActionn0(ActionEvent event) {
        int conteo=0;
        char numboton = '0';
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 1){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }

    }

    @FXML
    private void handleButtonActionopuesto(ActionEvent event) {
        pantalla.setText("+/-");
    }

    @FXML
    private void handleButtonActiondivision(ActionEvent event) {
        int conteo=0;
        String numboton = " / ";
        operacion = numero1;
        for(int i=0; i<operacion.length();i++){
            if(Character.isSpace(operacion.charAt(i))){
                conteo++;
            }
        }
        if(conteo >= 2){
            numero2 = numero2 + numboton;
            operacion = numero1 + numero2;
            pantalla.setText(operacion);
        } else {
            numero1= numero1 + numboton;
            pantalla.setText(numero1);
        }
        cuenta++;
        if(cuenta >=2){
            String[] split = operacion.split(" "); 
            String conversion1, conversion2, conversion3, conversion4; 

            int a = Integer.valueOf(split[0]);
            int b = Integer.valueOf(split[2]);
            int sumares = a+b;
            int restares = a-b;
            int multires = a*b;
            int divires = a/b;
        
            conversion1 = Integer.toString(sumares);
            conversion2 = Integer.toString(restares);
            conversion3 = Integer.toString(multires);
            conversion4 = Integer.toString(divires);

            String operador = split[1];
            switch(operador){
                case "+" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion1;
                break;
                case "-" : 
                    pantalla.setText(conversion2);
                    numero1 = conversion2;
                break;
                case "*" : 
                    pantalla.setText(conversion3);
                    numero1 = conversion3;
                break;
                case "/" : 
                    pantalla.setText(conversion1);
                    numero1 = conversion4;
                break;
                default : pantalla.setText("~~~~OPERACION INVALIDA~~~~");
            }
            numero1= numero1 + numboton;
            numero2 = "";
        }
    }

    @FXML
    private void handleButtonActionborrar(ActionEvent event) {
        operacion = "";
        numero1 = "";
        numero2 = "";
        pantalla.setText("");
    }

    @FXML
    private void handleButtonActioneliminar(ActionEvent event) {
        operacion = "";
        numero1 = "";
        numero2 = "";
        pantalla.setText("");
    }

    @FXML
    private void handleButtonActioninverso(ActionEvent event) {
        pantalla.setText("1 / x");
    }

    @FXML
    private void handleButtonActionresultado(ActionEvent event) {
        String[] split = operacion.split(" "); 
        String conversion1, conversion2, conversion3, conversion4; 

        int a = Integer.valueOf(split[0]);
        int b = Integer.valueOf(split[2]);
        int sumares = a+b;
        int restares = a-b;
        int multires = a*b;
        int divires = a/b;
        
        conversion1 = Integer.toString(sumares);
        conversion2 = Integer.toString(restares);
        conversion3 = Integer.toString(multires);
        conversion4 = Integer.toString(divires);

        String operador = split[1];
        switch(operador){
            case "+" : 
                pantalla.setText(conversion1);
                numero1 = conversion1;
            break;
            case "-" : 
                pantalla.setText(conversion2);
                numero1 = conversion2;
            break;
            case "*" : 
                pantalla.setText(conversion3);
                numero1 = conversion3;
            break;
            case "/" : 
                pantalla.setText(conversion1);
                numero1 = conversion4;
            break;
            default : pantalla.setText("~~~~OPERACION INVALIDA~~~~");
            
        }
        numero2 = "";
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 

    @FXML
    private void handleButtonActionnone(ActionEvent event) {
    }

    
}
