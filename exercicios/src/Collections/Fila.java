package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // offer e add -> adicionam elementos na fila
        // A diferen�a � o comportamento quando a fila est� cheia!
        fila.add("Ana");
        fila.offer("Bia"); // Lan�a uma exce��o.
        fila.add("Carlos"); // Retorna um false.
        fila.offer("Daniel");
        fila.add("Matheus");
        fila.offer("Gui");

        // Peek e element -> obtem o pr�ximo elemento da fila, sem remov�-lo.
        // Diferem no comportamento, quando a fila est� vazia.
        System.out.println(fila.peek());
        System.out.println(fila.peek()); // Retorna false;
        System.out.println(fila.element()); // Lan�a uma exce��o.
        System.out.println(fila.element());


        // Diferem no comportamento, quando a fila est� vazia.
        // Pool e remove -> obtem o pr�ximo elemento da fila, e o removem.
        System.out.println(fila.poll()); // Retorna false.
        System.out.println(fila.remove()); // Lan�a uma exce��o.
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
//        System.out.println(fila.remove());

        // Outros m�todos!
//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);


    }
}
