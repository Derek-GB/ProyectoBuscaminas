/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controlador.BuscaMinasController;
import Vista.FrmBuscaMinas;

/**
 *
 * @author d2tod
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmBuscaMinas vista = new FrmBuscaMinas();
        BuscaMinasController controlador = new BuscaMinasController(vista);
        vista.trySetControlador(controlador);
        controlador.iniciarJuego();
        vista.setVisible(true);
    }
    
}
