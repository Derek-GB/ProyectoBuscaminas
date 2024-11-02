/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Imagenes;

/**
 *
 * @author d2tod
 */
public class RutasImagenes {

    private static final int FRAMES = 4;
    private static final String FORMATO = ".png";
    private static final String BOMBA = "/Vista/Imagenes/Bomba/bomba";
    private static final String EXPLOSION = "/Vista/Imagenes/Bomba/bomba";
    private static final String BANDERA = "/Vista/Imagenes/Bandera/bandera";
    private static final String UNO = "/Vista/Imagenes/Uno/uno";
    private static final String DOS = "/Vista/Imagenes/Dos/dos";
    private static final String TRES = "/Vista/Imagenes/Tres/tres";
    private static final String CUATRO = "/Vista/Imagenes/Cuatro/cuatro";
    private static final String CINCO = "/Vista/Imagenes/Cinco/cinco";
    private static final String SEIS = "/Vista/Imagenes/Seis/seis";
    private static final String SIETE = "/Vista/Imagenes/Siete/siete";
    private static final String OCHO = "/Vista/Imagenes/Ocho/ocho";

    public static String[] getRutaBomba() {
        return getRuta(BOMBA);
    }

    public static String[] getRutaExplosion() {
        return getRuta(EXPLOSION);
    }

    public static String[] getRutaBandera() {
        return getRuta(BANDERA);
    }

    public static String[] getRutaUno() {
        return getRuta(UNO);
    }

    public static String[] getRutaDos() {
        return getRuta(DOS);
    }

    public static String[] getRutaTres() {
        return getRuta(TRES);
    }

    public static String[] getRutaCuatro() {
        return getRuta(CUATRO);
    }

    public static String[] getRutaCinco() {
        return getRuta(CINCO);
    }

    public static String[] getRutaSeis() {
        return getRuta(SEIS);
    }

    public static String[] getRutaSiete() {
        return getRuta(SIETE);
    }

    public static String[] getRutaOcho() {
        return getRuta(OCHO);
    }
    
    public static String[] getRutaDestapado(){
        throw new UnsupportedOperationException("Recuerdame");
    }

    private static String[] getRuta(String var) {
        String[] ruta = new String[FRAMES];
        for (int i = 0; i < FRAMES; i++) {
            ruta[i] = var + String.valueOf(i) + FORMATO;
        }
        return ruta;
    }

    private RutasImagenes() {
    }

}
