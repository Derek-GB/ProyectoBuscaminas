/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DYLAN
 */
public class Casilla {
    private boolean esMina;
    private Estado estado;
    private int numero;

    public boolean isEsMina() {
        return esMina;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public Casilla(boolean esMina, Estado estado, int numero) {
        this.esMina = esMina;
        this.estado = estado;
        this.numero = numero;
    }
    
    public Casilla() {
        this.esMina = false;         
        this.estado = Estado.CERRADA; 
        this.numero = 0;             
    }
    
    public void establecerMina() {
        this.esMina = true;
    }
    
    public void establecerNumero(int numero) {
        this.numero = numero;
    }
    
    public void destapar() {
        if (estado == Estado.CERRADA) {
            this.estado = Estado.DESTAPADA;
        }
    }
    
    public void marcar() {
        if (estado == Estado.CERRADA) {
            this.estado = Estado.MARCADA;
        } else if (estado == Estado.MARCADA) {
            this.estado = Estado.CERRADA;
        }
    }
    
}
