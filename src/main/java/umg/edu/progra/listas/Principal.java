package umg.edu.progra.listas;
import umg.edu.progra.listas.doblementeEnlazada.Nodo;
import umg.edu.progra.listas.doblementeEnlazada.DoblementeEnlazada;
/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);
        
        /*lista.visualizar();        
        
        
        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());
        
        
        
        lista.eliminar(3);
        System.out.println("lista: " + lista);
        
        System.out.println("\n");
        
        Nodo dato = lista.buscarLista(4);  
        System.out.println("dato: " + dato);
        
        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);
        
        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);
        
        System.out.println("lista " + lista);
        
        lista.visualizar();
        */
        
        /**
         * Ejercicio 1: Ordernar la lista de forma ascendente
         * Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes
         */
        /*System.out.println("Lista original:");
        lista.visualizar();
        
        // Ejercicio 1: Ordenar la lista
        lista.ordenarLista();
        System.out.println("\nLista ordenada:");
        lista.visualizar();
        */
        
        
        
        DoblementeEnlazada list= new DoblementeEnlazada();
        
        list.insertAtBeginning(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.displayForward();
        
        //contar los nodos
        System.out.println("Nodos en la lista: " + list.cuentaNodos());

        //Insertar despues de un valor especifico
        System.out.println("Insertar 4 despues de 3");
        if(list.insertarDespuesDe(3, 4)) {
        	list.displayForward();
        }else {
        	System.out.println("El valor no se encontro en la lista");
        }
        
        // Revertir la lista
        System.out.println("\nRevirtiendo la lista...");
        list.revertir();
        list.displayForward();
    }

}
