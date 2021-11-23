package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // offer e add -> adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia!
        fila.add("Ana");
        fila.offer("Bia"); // Lança uma exceção.
        fila.add("Carlos"); // Retorna um false.
        fila.offer("Daniel");
        fila.add("Matheus");
        fila.offer("Gui");

        // Peek e element -> obtem o próximo elemento da fila, sem removê-lo.
        // Diferem no comportamento, quando a fila está vazia.
        System.out.println(fila.peek());
        System.out.println(fila.peek()); // Retorna false;
        System.out.println(fila.element()); // Lança uma exceção.
        System.out.println(fila.element());


        // Diferem no comportamento, quando a fila está vazia.
        // Pool e remove -> obtem o próximo elemento da fila, e o removem.
        System.out.println(fila.poll()); // Retorna false.
        System.out.println(fila.remove()); // Lança uma exceção.
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
//        System.out.println(fila.remove());

        // Outros métodos!
//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);


    }
}
