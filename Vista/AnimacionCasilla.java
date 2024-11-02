/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Estado;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author d2tod
 */
public class AnimacionCasilla extends Thread {

    private JLabel label;
    private Estado desde;
    private Estado hasta;

    public AnimacionCasilla(JLabel label, Estado desde, Estado hasta) {
        this.label = label;
        this.desde = desde;
        this.hasta = hasta;
    }

    public AnimacionCasilla(JLabel label, Estado hasta) {
        this(label, Estado.CERRADA, hasta);
    }

    @Override
    public void run() {
        String[] direcciones = escogerDirecciones();
        playAnimacion(direcciones);
    }

    private String[] escogerDirecciones() {
        if (desde == Estado.CERRADA) {
            return switch (hasta) {
                case (Estado.MARCADA) ->
                    new String[]{""};
                default ->
                    new String[]{""};
            };
        } else if (desde == Estado.MARCADA) {
            return new String[]{};
        }
        return null;
    }

    private void playAnimacion(String[] direcciones) {
        int frames = direcciones.length;
        for (int i = 0; i < frames; i++) {
            ajustarImagen(direcciones[i], label);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }

    private void ajustarImagen(String ubicacion, javax.swing.JLabel label) {
        ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
    }
}
