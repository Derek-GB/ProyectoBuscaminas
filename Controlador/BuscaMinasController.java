/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

//import Interfaces.Observable;
import Interfaces.Observador;
import Modelo.Casilla;
import Modelo.Estado;
import Modelo.Tablero;
import Vista.AnimacionCasilla;
import Vista.FrmBuscaMinas;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

/**
 *
 * @author d2tod
 */
public class BuscaMinasController implements Observador /*, MouseListener*/ {

    private Tablero tablero;
    private FrmBuscaMinas vista;

    public BuscaMinasController(FrmBuscaMinas vista) {
        this.vista = vista;
        this.tablero = new Tablero();
        this.tablero.añadirObservador(this);
    }

    public void iniciarJuego() {
        tablero.inicializarTablero();
//        vista.actualizarVista(tablero);
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
        } else if (señal instanceof Boolean explosion && explosion) {
            // Si la señal es un Boolean y es true, significa que una mina explotó
            verificarFinDeJuego(false);  // false indica que el jugador ha perdido
            return true;
        }
        return false;
    }

//    @Override
//    public void emitirSeñal(Object señal) {
//        for (Observador observador : observadores) {
//            observador.RecibirSeñal(señal);
//        }
//    }
//    @Override
//    public boolean añadirObservador(Observador observador) {
//        if (!observadores.contains(observador)) {
//            observadores.add(observador);
//            return true;
//        }
//        return false;
//    }
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        /*Estos eventos de mouse es por el MouseListener, pero solo se necesita
//        el mouse Clicked, este revisa cual de los dos clics se hizo y en base a eso actua*/
//        switch (e.getButton()) {
//            case (MouseEvent.BUTTON1) -> {
//                //En caso de clic izquierdo...
//
//            }
//            case (MouseEvent.BUTTON3) -> {
//                //En caso de clic derecho...
//
//            }
//        }
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//    }
    public void manejarMarcadoCasilla(int fila, int columna) {
        tablero.marcarCasilla(fila, columna);
//        vista.actualizarVista(tablero);
    }

    public void manejarDestapadoCasilla(int fila, int columna) {
        tablero.destaparCasilla(fila, columna);
        if (!tablero.hayMinasDestapadas() && !tablero.hayCasillasSinDestapar()) {
            verificarFinDeJuego(true);  
        }
//        vista.actualizarVista(tablero);
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
//        vista.actualizarVista(tablero);
    }

}
