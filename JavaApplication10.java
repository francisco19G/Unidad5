/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author FRANCISCO JAVIER
 */

public class JavaApplication10 {
    public static int resta(int a, int b){
        int resultado=a-b;
        return resultado;
        
    }
    public static int suma(int a, int b){
        int resultadoS=a+b;
   return resultadoS;
    }
    public static int division(int a, int b){
        int resultadoD=b/a;
     return resultadoD;
    }
    public static int multiplicacion(int a, int b){
        int resultadoMult=a*b;
        return resultadoMult;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado=JavaApplication10.resta(5, 10);
        System.out.println("El resultado de la resta es: " + resultado);
        int resultadoS=JavaApplication10.suma(5,10);
        System.out.println("El resultado de la suma es: " + resultadoS);
        int resultadoD=JavaApplication10.division(5, 10);
        System.out.println("El resultado de la division es: " + resultadoD);
        int resultadoMult=JavaApplication10.multiplicacion(5, 10);
        System.out.println("El resultado de la multiplicacion es " + resultadoMult);
    }
    
}
