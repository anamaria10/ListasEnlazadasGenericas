package co.edu.um.ListasEnlazadasGenericas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       LEG<Integer> l = new LEG<Integer>();
        l.insertar(new Integer(9));
        l.insertar(new Integer(12));
        System.out.println("Lista de Integer actual:\n" +l.toString());
        System.out.println("Borrado de la lista el 10:");
        if (!l.eliminar(new Integer(10))){
            System.out.println("Elemento Inesxistente");
        }
    }
}
