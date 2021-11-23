package Collections;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Charactere

        System.out.println("Tamanho é: " + conjunto.size()); // Mostra o tamanho do conjunto

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains(1)); // Verificar se está contido

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

//        conjunto.addAll(nums); // União entre dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); // Retém somente a interceção entre os dois conjuntos.
        System.out.println(conjunto);

        conjunto.clear(); // Limpar conjunto
        System.out.println(conjunto);
    }
}
