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
public class HiloProductor extends Thread {
    private Buffer buffer;

    public HiloProductor(Buffer f){
        buffer=f;
    }

    public void run(){

        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(600);
                buffer.escribirBuffer();
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloProductor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

