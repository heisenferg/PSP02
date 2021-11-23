package Ejercicio01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Buffer {

    private final int cantidadCaracteres = 6;
    private ArrayList<Character> caracteres = new ArrayList<Character>();

    public synchronized void escribirBuffer() throws InterruptedException {


        char caracter = (char) (Math.random() * 27 + 'a');
        try {
            while (cantidadCaracteres <= caracteres.size()) {
                System.out.println("Búffer está lleno.");
                this.wait();
                this.notifyAll();
            }
        } catch (InterruptedException e) {
        }

        caracteres.add(caracter);
        System.out.println("Caracter guardado " + caracter);

        this.notifyAll();
    }

    public synchronized void leerBuffer() {
        try {
            while (caracteres.size() == 0) {

                System.out.println("No hay nada en el búffer");
                this.wait();
                this.notifyAll();
            }

        } catch (InterruptedException e) {
        }
        char caracter = caracteres.get(caracteres.size() - 1);
        caracteres.remove(caracteres.size() - 1);
        System.out.println("Búffer leído " + caracter + ", quedan " + caracteres.size() +  " caracteres.");
        this.notifyAll();
    }
}
