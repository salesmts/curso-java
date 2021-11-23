package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Matheus");
        usuarios.put(2, "Ana");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Matheus"));

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(4));
        System.out.println(usuarios.remove(3, "Gui")); // Não remove, pois o valor não corresponde

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }
}
