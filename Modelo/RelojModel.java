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
public class RelojModel extends Thread {

    public void run() {
        for (int h = 0; h <= 12; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    String strH = h < 10 ? "0" + h : h + "";
                    String strM = m < 10 ? "0" + m : m + "";
                    String strS = s < 10 ? "0" + s : s + "";
                    JFReloj.etiReloj.SetTex(strH+":"+strM+":"+strS);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        
                    }
                }
            }
        }
    }

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
