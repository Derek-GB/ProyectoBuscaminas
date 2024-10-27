/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Interfaces.Observable;
import Interfaces.Observador;
import Vista.FrmBuscaMinas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author d2tod
 */
public class BuscaMinasController implements Observable, MouseListener{
    private ArrayList<Observador> observadores;

    public BuscaMinasController(FrmBuscaMinas vista) {
        this.observadores = new ArrayList<>();
    }
    
    
    
    @Override
    public void emitirSeñal(Object señal) {
        for(Observador observador:observadores){
            observador.RecibirSeñal(señal);
        }
    }

    @Override
    public boolean añadirObservador(Observador observador) {
        if (!observadores.contains(observador)){
            observadores.add(observador);
            return true;
        }
        return false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*Estos eventos de mouse es por el MouseListener, pero solo se necesita
        el mouse Clicked, este revisa cual de los dos clics se hizo y en base a eso actua*/
        switch(e.getButton()){
            case(MouseEvent.BUTTON1)->{
                //En caso de clic izquierdo...
                
            }
            case(MouseEvent.BUTTON3)->{
                //En caso de clic derecho...
                
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    
    
}
