package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Pr�ncipe"); // Retorna true or false
        livros.push("B�blia"); // Retorna exce��o.
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for(String livro: livros) {
            System.out.println(livro); // O for mostra na ordem da fila!
        }

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
//        System.out.println(livros.pop()); // Tamb�m retorna uma exce��o.
//        System.out.println(livros.remove());

//        livros.size();
//        livros.clear();
//        livros.contains(...);
    }
}
