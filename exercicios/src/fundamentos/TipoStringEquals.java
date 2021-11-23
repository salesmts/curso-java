package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("2" == s2);
        System.out.println("2".equals(s2));

        entrada.close();

        String a = new String("Teste");
        String b = new String("Teste");
        System.out.print(a.equals(b));

        // Sempre se comprar Strings com .equals !!!
    }
}
