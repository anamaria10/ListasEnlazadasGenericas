package co.edu.um.ListasEnlazadasGenericas;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10/08/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodoLEG <E> {
    E dato; //permite crear lista enlazadas genericas de cualquier tipo
    NodoLEG<E> siguiente; //referencia al nodo siguiente

    NodoLEG(int dato){
        this(dato,null);
    }
    NodoLEG(E dato, NodoLEG<E> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoLEG(int dato, Object siguiente) {
        //To change body of created methods use File | Settings | File Templates.
    }
}
