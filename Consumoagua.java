/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumoagua;

/**
 *
 * @author Usuario
 */
public class Consumoagua {
    public static void consAguaCasa(int agua[][]){
    int[] casa = new int [agua.length];
        for (int i = 0; i < agua.length; i++) {
            int suma=0;
            for (int j = 0; j < agua[i].length; j++) {
                suma += agua[i][j];
            }
            System.out.println("El consumo por casa es de " + suma);
        }
}
    public static void consAguaDia(int agua [][]){
        int[] dia = new int[agua[0].length];
        for (int i = 0; i < agua[0].length; i++) {
            int suma=0;
            for (int j = 0; j < agua.length; j++) {
                suma+=agua[j][i];   
            }
            System.out.println("El consumo por dia es de " + suma);
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][]agua={
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {46, 100, 56, 26, 30},
            {6, 110, 72, 33, 40}
        };
        Consumoagua.consAguaCasa(agua);
        Consumoagua.consAguaDia(agua);
    }
}
    

