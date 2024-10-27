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

    
    public void iniciar() {
        if (!corriendo) {
            this.tiempoActual = LocalTime.now();
            corriendo = true;
        }
    }

    public void detener() {
        if (corriendo) {
            corriendo = false;
        }
    }

    public void reiniciar() {
        this.tiempoActual = LocalTime.now();
        corriendo = true;
    }

    private RelojModel() {
        this.tiempoActual = LocalTime.now();
        this.corriendo = false;
    }

    public static RelojModel getinstance() {
        if (reloj == null) {
            reloj = new RelojModel();
        }
        return reloj;
    }

    public LocalTime getTiempoActual() {
        return tiempoActual;
    }
}
