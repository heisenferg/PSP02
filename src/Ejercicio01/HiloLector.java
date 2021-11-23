package Ejercicio01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class HiloLector extends Thread {
    private Buffer buffer;

    public HiloLector (Buffer b){
        buffer=b;
    }

    public void run(){
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloLector.class.getName()).log(Level.SEVERE, null, ex);
            }
            buffer.leerBuffer();
        }

    }
}
