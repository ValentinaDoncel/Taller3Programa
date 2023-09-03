/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author einva
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 2;
        int[] CodiPro = new int[n];
        double[] ValorPro = new double[n];
        int[] CantiVendido = new int[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= n; i++) {
            System.out.println("Digita el codigo del produncto " + (i + 1) + (": "));
            CodiPro[i] = scanner.nextInt();
            System.out.println("Digite el valor del producto: ");
            ValorPro[i] = scanner.nextDouble();
            System.out.println("Digite la cantidad de productos vendidos: ");
            CantiVendido[i] = scanner.nextInt();
        }
        int TotalProVen = 0;
        double IngreVent = 0;

        for (int i = 0; i <= n; i++) {
            TotalProVen = TotalProVen + CodiPro[i];
            IngreVent = IngreVent + ValorPro[i];
        }

        int productoMasVendido = CodiPro[0];
        double productoMasCostoso = ValorPro[0];

        for (int i = 1; i < n; i++) {
            if (CantiVendido[i] > CantiVendido[i - 1]) {
                productoMasVendido = CodiPro[i];
            }

            if (ValorPro[i] > productoMasCostoso) {
                productoMasCostoso = ValorPro[i];
            }
        }

        System.out.println("Total de productos vendidos en el dia: " + TotalProVen);
        System.out.println("Total ingresos por ventas del día: $" + IngreVent);
        System.out.println("El producto más vendido tiene el código: " + productoMasVendido);
        System.out.println("El producto más costoso vendido tiene un valor de venta de: $" + productoMasCostoso);

        scanner.close();
    }
}