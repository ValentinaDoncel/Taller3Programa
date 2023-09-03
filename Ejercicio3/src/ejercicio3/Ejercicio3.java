/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Idalit Zarate
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n=3;
        double suma=0;
        
        for (int i=1 ; i<=n; i++){
            suma = suma +(i/Math.pow(2,i));
        }
        System.out.println("El resultado de la suma es: "+ suma);
    }
    
}
