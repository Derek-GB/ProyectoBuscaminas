/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JLabel;

/**
 *
 * @author Tony
 */
public class Reloj extends Thread {

    private JLabel label;
    private int horas, minutos, segundos;
    private boolean corriendo, pausa;

    public Reloj(JLabel label) {
        this.label = label;
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.corriendo = true;
        this.pausa = false;
    }

    public void pausar() {
        pausa = true;
    }

    public void reanudar() {
        pausa = false;
        synchronized (this) {
            this.notify();
        }
    }

    public void reiniciar() {
        pausa = true;
        horas = 0;
        minutos = 0;
        segundos = 0;
        actualizarLabel();
    }

//    public boolean isRunning() {
//        return running;
//    }
    private void actualizarLabel() {
        label.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos));
//        SwingUtilities.invokeLater(() -> label.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos)));
    }

    @Override
    public void run() {
        try {
            while (corriendo) {
                synchronized (this) {
                    if (pausa) {
                        this.wait();
                    }
                }

                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }

                actualizarLabel();

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
