/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Interfaces.Observador;
import Modelo.Casilla;
import Modelo.Estado;
import Modelo.Tablero;
import Vista.AnimacionCasilla;
import Vista.FrmBuscaMinas;


/**
 *
 * @author d2tod
 */
public class BuscaMinasController implements Observador {

    private Tablero tablero;
    private FrmBuscaMinas vista;

    public BuscaMinasController(FrmBuscaMinas vista) {
        this.vista = vista;
        this.tablero = new Tablero();
        this.tablero.añadirObservador(this);
    }

    public void iniciarJuego() {
        tablero.inicializarTablero();
    }

    @Override
    public boolean RecibirSeñal(Object señal, int[] posicion) {
        if (señal instanceof Casilla casilla) {
            (new AnimacionCasilla(vista.getCasilla(posicion), casilla.getEstado(), casilla.isEsMina(), tablero.contarMinasCircundantes(posicion[0], posicion[1]))).start();
            if (casilla.getEstado() == Estado.CERRADA) {
                vista.sumarContadorBandera();
            } else if (casilla.getEstado() == Estado.MARCADA) {
                vista.restarContadorBandera();
            }

            return true;
        } else if (señal instanceof Boolean explosion) {
            if (explosion){  
            verificarFinDeJuego(false);  
            return true;
            } else {
                verificarFinDeJuego(true);
            }
        }
        return false;
    }

    public void manejarMarcadoCasilla(int fila, int columna) {
        tablero.marcarCasilla(fila, columna);
    }

    public void manejarDestapadoCasilla(int fila, int columna) {
        tablero.destaparCasilla(fila, columna);
        if (!tablero.hayMinasDestapadas() && !tablero.hayCasillasSinDestapar()) {
            verificarFinDeJuego(true);  
        }
    }

    public void verificarFinDeJuego(boolean victoria) {
        if (victoria) {
            vista.mostrarFinDeJuego("Ganaste"); 
        } else {
            vista.mostrarFinDeJuego("Perdiste");
        }
    }

    public void reiniciarJuego() {
        tablero.inicializarTablero();
    }

}
