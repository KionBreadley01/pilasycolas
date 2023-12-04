/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasycola;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ROBERTO
 */
public class Pilasycola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("++++++++++++++++pila y cola+++++++++++++++++++++++++++");

        // Implementación de una pila
        Deque<Integer> pila = new ArrayDeque<>();
        // Agregar elementos
        pila.push(1);
        pila.push(2);
        pila.push(3);

        // Mostrar elementos
        System.out.println("La Pila: " + pila);

        int elementoPila = pila.pop(); // Obtener y eliminar
        System.out.println("Elemento sacado de la pila: " + elementoPila);
        System.out.println("Contenido de la pila después de haber sacado un elemento: " + pila);
        System.out.println("Tamaño de la pila actual: " + pila.size());
        System.out.println("LA pila esta vacia? " +pila.isEmpty());

        // Cola
        Queue<String> cola = new LinkedList<>();
        cola.add("Gato 1");
        cola.add("Gato 2");
        cola.add("Gato 3");
        System.out.println("Cola: " + cola);
        String elementoCola = cola.poll();
        System.out.println("Elemento frontal de la cola: " + elementoCola);
        System.out.println("Cola después de poll: " + cola);
        System.out.println("Tamaño de la cola actual: " + cola.size());
        System.out.println("La cola está vacía? " + cola.isEmpty());

    }
    
}