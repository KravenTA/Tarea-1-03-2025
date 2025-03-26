package umg.edu.progra.listas.doblementeEnlazada;
import umg.edu.progra.listas.doblementeEnlazada.Nodo;

public class DoblementeEnlazada {


	private Nodo head;
	private Nodo tail;

	public DoblementeEnlazada() {
		this.head = null;
		this.tail = null;
	}

	public void insertAtEnd(int data) {
		Nodo newNode = new Nodo(data);
		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void insertAtBeginning(int data) {
		Nodo newNode = new Nodo(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public boolean delete(int data) {
		Nodo current = head;
		while (current != null) {
			if (current.data == data) {
				if (current == head) {
					head = current.next;
					if (head != null)
						head.prev = null;
				} else if (current == tail) {
					tail = current.prev;
					if (tail != null)
						tail.next = null;
				} else {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public boolean search(int data) {
		Nodo current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void displayForward() {
		Nodo current = head;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void displayBackward() {
		Nodo current = tail;
		while (current != null) {
			System.out.print(current.data + " <-> ");
			current = current.prev;
		}
		System.out.println("null");
	}
	
	// Método 1: Contar el número de nodos en la lista
	
	public int cuentaNodos() {
		int contador=0;
		Nodo nodoActual= head;
		while(nodoActual!=null) {
			contador++;
			nodoActual= nodoActual.next;
		}
		return contador;
	}
	
	// Método 2: Insertar un nodo después de un valor específico
	
	public boolean insertarDespuesDe(int objetivo, int data) {
	    Nodo nodoActual = head;
	    while (nodoActual != null) {
	    	
	        if (nodoActual.data == objetivo) {  // Si encontramos el nodo con el valor objetivo
	            Nodo newNode = new Nodo(data);
	            newNode.next = nodoActual.next;
	            newNode.prev = nodoActual;
	            
	            if (nodoActual.next != null) {
	            	
	            	nodoActual.next.prev = newNode;
	            	
	            } else {
	                tail = newNode;  // Si estamos en el último nodo, actualizamos tail
	            }
	            
	            nodoActual.next = newNode;
	            return true;
	        }
	        nodoActual = nodoActual.next;
	    }
	    return false;  // No se encontró el valor
	}

	// Método 3: Revertir la lista doblemente enlazada

	public void revertir() {
	    Nodo nodoActual = head;
	    Nodo temp = null;
	    
	    while (nodoActual != null) {
	        temp = nodoActual.prev;
	        nodoActual.prev = nodoActual.next;
	        nodoActual.next = temp;
	        nodoActual = nodoActual.prev;  // Moverse al siguiente nodo (que ahora está en prev)
	    }
	    
	    // Intercambiamos head y tail
	    if (temp != null) {
	        head = temp.prev;
	    }
	}

}