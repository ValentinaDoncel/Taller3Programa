/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_javaejercicio.pkg1;

/**
 *
 * @author ESTUDIANTES
 */
public class Area_javaejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double longitud= 4.5;
        double anchura= 8.5;

        double superficie = longitud*anchura;
        System.out.println("superficie: "+superficie);
    }
    public static double calcular_superficie (double longitud, double anchura){
        
        return longitud * anchura;    
      }
}
