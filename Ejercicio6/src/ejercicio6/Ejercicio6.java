/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author einva
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto (a): ");
        double catetoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto (b): ");
        double catetoB = scanner.nextDouble();

        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        double anguloAlfa = Math.toDegrees(Math.asin(catetoA / hipotenusa));

        double anguloBeta = 90 - anguloAlfa;

        System.out.println("Hipotenusa (c): " + hipotenusa);
        System.out.println("Ángulo agudo alfa (α): " + anguloAlfa + " grados");
        System.out.println("Ángulo agudo beta (β): " + anguloBeta + " grados");

        scanner.close();
    }
}
