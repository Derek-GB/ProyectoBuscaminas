/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JLabel;

/**
 *
 * @author d2tod
 */
public class AnimacionCasilla extends Thread{
    public void cambiarIcono(JLabel label){
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if(casillas[i][j].equals(label)){
                    
                }
            }
        }
    }
}
