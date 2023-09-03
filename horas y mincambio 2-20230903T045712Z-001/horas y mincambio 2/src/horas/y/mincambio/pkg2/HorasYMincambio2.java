/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horas.y.mincambio.pkg2;

import static java.lang.Double.min;

/**
 *
 * @author ESTUDIANTES
 */
public class HorasYMincambio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horamil =0;
        int horaAm;
        int min=30;
        String AmPm;
        String HorAmpm;
                
        if (horamil > 12){
            horaAm=horamil-12;
            AmPm="pm";
        }
        else{
            horaAm=horamil;
            AmPm="am";
        }
        System.out.printf("horamil %d:%d%n", horamil, min);
        System.out.println(AmPm);
    }
    
  public static String horaAMPM(int hora, int minuto) {
        int horaAM = hora;

        if (hora > 12) {
            horaAM = hora - 12;
        }

        String amPm = hora >= 12 ? "pm" : "am";

        return String.format("%02d:%02d %s", horaAM, minuto, amPm);
    }
}
