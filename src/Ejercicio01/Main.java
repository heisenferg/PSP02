package Ejercicio01;

/*
 * un hilo productor almacene datos (15 caracteres) en un búfer compartido,
 * recoge un hilo consumidor (consume 15 caracteres).
 * La capacidad del búfer ahora es de 6 caracteres,
 * el consumidor podrá estar cogiendo caracteres del búfer siempre que éste no esté vacío.
 * El productor sólo podrá poner caracteres en el búfer, cuando esté vacío o haya espacio.
 */


/**
 *
 * @author Fernando
 */
public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        HiloProductor escritor = new HiloProductor(buffer);
        HiloLector lector = new HiloLector(buffer);


        escritor.start();
        lector.start();
    }
}
