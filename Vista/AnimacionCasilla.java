/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Estado;
import Vista.Imagenes.RutasImagenes;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author d2tod
 */
public class AnimacionCasilla extends Thread {

    private static HashMap<String, Icon> sprites = new HashMap<>();
    private JLabel label;
    private Estado estado;
    private boolean esMina;
    private int minas;

    public AnimacionCasilla(JLabel label, Estado estado, boolean esMina, int minas) {
        this.label = label;
        this.estado = estado;
        this.esMina = esMina;
        this.minas = minas;
    }

    @Override
    public void run() {
        String[] direcciones = escogerRuta();
        playAnimacion(direcciones);
        if (esMina && estado == Estado.DESTAPADA) {
            playAnimacionExplosion();
        } else if (estado == Estado.CERRADA) {
            label.setIcon(null);
        }
    }

    private String[] escogerRuta() {
        return switch (estado) {
            case (Estado.MARCADA) ->
                RutasImagenes.getRutaBandera();
            case (Estado.CERRADA) ->
                invertirOrden(RutasImagenes.getRutaBandera());
            case (Estado.DESTAPADA) ->
                escogerDestapado();
            default ->
                new String[]{""};
        };

    }

    private String[] escogerDestapado() {
        if (esMina) {
            return RutasImagenes.getRutaBomba();
        }
        return switch (minas) {
            case (0) ->
                RutasImagenes.getRutaDestapado();
            case (1) ->
                RutasImagenes.getRutaUno();
            case (2) ->
                RutasImagenes.getRutaDos();
            case (3) ->
                RutasImagenes.getRutaTres();
            case (4) ->
                RutasImagenes.getRutaCuatro();
            case (5) ->
                RutasImagenes.getRutaCinco();
            case (6) ->
                RutasImagenes.getRutaSeis();
            case (7) ->
                RutasImagenes.getRutaSiete();
            case (8) ->
                RutasImagenes.getRutaOcho();
            default ->
                new String[]{""};
        };
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

    private void playAnimacionExplosion() {
        reproducirExploción();
        playAnimacion(RutasImagenes.getRutaExplosion());
    }

    private String[] invertirOrden(String[] ruta) {
        int frames = ruta.length;
        for (int i = 0; i < frames / 2; i++) {
            String temp = ruta[i];
            ruta[i] = ruta[frames - 1 - i];
            ruta[frames - 1 - i] = temp;
        }
        return ruta;
    }

    private void ajustarImagen(String ubicacion, javax.swing.JLabel label) {
        Icon icon = sprites.get(ubicacion);
        if (icon == null) {
            ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
            icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
            sprites.put(ubicacion, icon);
        }
        label.setIcon(icon);
    }

    private void reproducirExploción() {
        new Thread(() -> {
            Clip clip = null;

            try {
                InputStream audioStream = getClass().getResourceAsStream("/Sonido/Mina (mp3cut.net).wav");
                if (audioStream == null) {
                    throw new FileNotFoundException("No se pudo encontrar el archivo de sonido.");
                }
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioStream);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                Thread.sleep(10000);
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
                System.out.println("Error al reproducir el archivo de sonido: " + e.getMessage());
            } finally {
                if (clip != null && clip.isRunning()) {
                    clip.stop();
                    clip.close();
                }
            }
        }).start();
    }
}
