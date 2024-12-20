/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author alons
 */
import Clases.Character;

public class Cola<T> {

    private Nodo First;
    private Nodo Last;
    private int size;

    /**
     * Metodo constructor por defecto
     */
    public Cola() {
        this.First = null;
        this.Last = null;
        this.size = 0;
    }

    /**
     * @return the getFirst() == null Verifica si si la lista está vacía
     */
    public boolean isEmpty() {
        return getFirst() == null;
    }

    /**
     * Metodo para vaciar la lista
     */
    public void empty() {
        this.First = null;
        this.Last = null;
        this.size = 0;
    }

    /**
     * @return the First
     */
    public Nodo getFirst() {
        return First;
    }

    /**
     * Metodo encolar
     *
     * @param elem Elemento a encolar
     */
    public void Encolar(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (isEmpty()) {
            nuevo.setpNext(First);
            First = nuevo;
            First.setpNext(Last);
            Last = nuevo;
            size++;
        } else {
            Last.setpNext(nuevo);
            Last = nuevo;
            size++;
        }
    }

    /**
     * Metodo desencolar
     */
    public Nodo Desencolar() {
        Nodo node;
        if (!this.isEmpty()) {
            node = First;
            if (getSize() == 1) {
                this.empty();
            } else {
                First = First.getpNext();
                size--;
            }
            return node;

        }
        return null;
    }

    public String imprimir() {
        String contenido = "";
        for (Nodo<Character> aux = getFirst(); aux != null; aux = aux.getpNext()) {
            Character character = aux.getData();
            contenido += "(ID:" + character.getId() + ") ";
            contenido += character.getName() + "\n";
            //System.out.println(aux.getElement().getId()+" "+aux.getElement().getName() +" "+aux.getElement().getObject());
        }
        return contenido;
    }

    public void delete(Nodo nodeToDelete) {
        Nodo aux = First;
        if (aux == nodeToDelete) {
            Desencolar();
        } else {
            while (aux != null && aux.getpNext() != nodeToDelete) {
                aux = aux.getpNext();
            }

            // Si encontramos el nodo anterior al que queremos eliminar, lo eliminamos
            if (aux != null && aux.getpNext() == nodeToDelete) {
                aux.setpNext(nodeToDelete.getpNext());
            }
        }
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
}
