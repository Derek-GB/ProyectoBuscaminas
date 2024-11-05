/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.Interfaces;

/**
 *
 * @author d2tod
 */
public interface Observable {
    public void emitirSeñal(Object señal, int[] posicion);
    public boolean añadirObservador(Observador observador);
}
