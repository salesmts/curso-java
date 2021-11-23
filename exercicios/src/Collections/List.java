package Collections;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Matheus");

        lista.add(u1);
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Telma"));
        lista.add(new Usuario("Mika"));
        lista.add(new Usuario("João"));

        System.out.println(lista.get(3)); // Acessar pelo índice.

        lista.remove(1);
        lista.remove(new Usuario("Telma"));
        lista.contains(new Usuario("Mika"));


        for(Usuario u: lista){
            System.out.println(u);
        }


    }
}
