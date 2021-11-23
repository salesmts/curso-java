package Collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Matheus"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Kleber"));
        usuarios.add(new Usuario("Tânia"));

        boolean resultado = usuarios.contains(new Usuario("Kleber"));
        System.out.println(resultado);
    }
}
