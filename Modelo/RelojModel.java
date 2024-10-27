/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalTime;

/**
 *
 * @author Tony
 */
public class RelojModel {
    private static RelojModel reloj;
    
    private LocalTime tiempoActual;
    private boolean corriendo;
    
    
     public static RelojModel () {
        if (reloj == null) {
            reloj = new RelojModel();
        }
        return reloj;
     }
}
