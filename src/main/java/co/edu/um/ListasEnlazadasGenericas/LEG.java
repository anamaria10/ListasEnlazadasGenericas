package co.edu.um.ListasEnlazadasGenericas;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10/08/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class LEG <E> {

    protected NodoLEG<E> primero;protected int talla;

    public LEG(){
        primero = null;
        talla=0;

    }

    public void insertar(E x){

        NodoLEG<E>nuevo=new NodoLEG<E>(10);
        nuevo.siguiente = primero;
        primero = nuevo; this.talla++;
    }

    public void insertarEnFin(E x){
        NodoLEG<E>nl = new NodoLEG<E>(8);this.talla++;
        NodoLEG<E>aux = primero;

        if (aux == null){
            primero = nl;
        } else {
            while (aux.siguiente != null){
                aux = aux.siguiente;
                aux.siguiente = nl;
            }
        }
    }

    public String toString(){
        String res = "";

        for (NodoLEG<E> aux = primero; aux != null; aux=aux.siguiente){
            res += aux.dato.toString()+"\n";
        }
        return res;
    }

    public boolean eliminar(E x){
        NodoLEG<E>aux=primero,ant= null; boolean res = false;
        while (aux != null && !aux.dato.equals(x)){
            ant=aux; aux=aux.siguiente;
        }
        if (aux != null){
            res = true; this.talla--;

            if (ant == null)primero = aux.siguiente;
            else ant.siguiente = aux.siguiente;
        }
        return res;
    }
}
