/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author alons
 */
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
    public boolean isEmpty(){
        return getFirst() == null;
    }
    
    /**
     * Metodo para vaciar la lista
     */

    public void empty(){
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
     * @param elem Elemento a encolar
     */
    
    public void Encolar(T elem){
        Nodo nuevo = new Nodo(elem);
        if (isEmpty()){
            nuevo.setpNext(First);
            First = nuevo;
            First.setpNext(Last);
            Last = nuevo;
        }
        else{
            Last.setpNext(nuevo);
            Last = nuevo; 
            size++;
        }
    }
    
    /**
     * Metodo desencolar
     */
    
    public void Desencolar(){
      
        if(!this.isEmpty()){
        if (size == 1) { 
        this.empty();
        }
        else{ 
        First = First.getpNext();
        size--;
        }
        
      }
    }    
}
