/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear nuevo objeto Scanner
        Scanner input =new Scanner(System.in);
        
        //Mostrar mensaje al usuario
        System.out.println("INGRESE UNA TEMPERATURA EN CELSIUS");
        double celsius=input.nextDouble();
        
        //Convertir Celsius a Fahrenheit
        double fahrenheit = 9.0 / 5* celsius + 32;
        
        //Mostrar el resultado
        System.out.println(celsius +"Celsius son " + fahrenheit + " en Fahrenheit");
    }
    
}
