/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Interfaces.Observable;
import Modelo.Interfaces.Observador;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Tablero implements Observable {

    private ArrayList<Observador> observadores;
    private Casilla[][] casillas;
    private int totalMinas;
    private final int filas = 12;
    private final int columnas = 12;

    public Tablero() {
        this.totalMinas = 30;
        this.casillas = new Casilla[filas][columnas];
        this.observadores = new ArrayList<>();
    }

    public void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casillas[i][j] = new Casilla(false, Estado.CERRADA, 0);
            }
        }
        colocarMinas();
    }

    private void colocarMinas() {
        int minasColocadas = 0;
        while (minasColocadas < totalMinas) {
            int fila = (int) (Math.random() * filas);
            int columna = (int) (Math.random() * columnas);
            if (!casillas[fila][columna].isEsMina()) {
                casillas[fila][columna].establecerMina();
                minasColocadas++;
            }
        }
    }

    @Override
    public void emitirSeñal(Object señal, int[] posicion) {
        for (Observador observador : observadores) {
            observador.RecibirSeñal(señal, posicion);
        }
    }

    @Override
    public boolean añadirObservador(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
            return true;
        }
        return false;
    }

    public void destaparCasilla(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            if (casillas[fila][columna].getEstado() != Estado.DESTAPADA) {
                casillas[fila][columna].destapar();
                emitirSeñal(casillas[fila][columna], new int[]{fila, columna});
                if (casillas[fila][columna].isEsMina()) {
                    finalizarPartida();
                    return;
                }
                int minasCircundantes = contarMinasCircundantes(fila, columna);
                casillas[fila][columna].establecerNumero(minasCircundantes);

                if (minasCircundantes == 0) {
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            if (i != 0 || j != 0) {
                                destaparCasilla(fila + i, columna + j);
                            }
                        }
                    }
                }

                if (verificarVictoria()) {
                    emitirSeñal(false, null);
                }
            }
        }
    }

    public int contarMinasCircundantes(int fila, int columna) {
        int contador = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;
                if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
                    if (casillas[nuevaFila][nuevaColumna].isEsMina()) {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    public void marcarCasilla(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            casillas[fila][columna].marcar();
            emitirSeñal(casillas[fila][columna], new int[]{fila, columna});
        }
    }

    public boolean hayMinasDestapadas() {
        for (Casilla[] casilla : casillas) {
            for (Casilla casilla1 : casilla) {
                if (casilla1.isEsMina() && casilla1.getEstado() == Estado.DESTAPADA) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hayCasillasSinDestapar() {
        for (Casilla[] casilla : casillas) {
            for (Casilla casilla1 : casilla) {
                if (casilla1.getEstado() == Estado.CERRADA) {
                    return true;
                }
            }
        }
        return false;
    }

    public void finalizarPartida() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (casillas[i][j].isEsMina()) {
                    casillas[i][j].destapar();
                    emitirSeñal(casillas[i][j], new int[]{i, j});
                }
            }
        }
        emitirSeñal(true, null);
    }

    public boolean verificarVictoria() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (!casillas[i][j].isEsMina() && casillas[i][j].getEstado() != Estado.DESTAPADA) {
                    return false;
                }
            }
        }
        return true;

    }
}
