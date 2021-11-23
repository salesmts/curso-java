package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o dia da semana: ");

        String diaDaSemana = entrada.next();

        if ("domingo".equalsIgnoreCase(diaDaSemana)){
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(diaDaSemana)){
            System.out.println(2);
        } else if ("terça".equalsIgnoreCase(diaDaSemana) || "terca".equalsIgnoreCase(diaDaSemana)){
            System.out.println(3);
        } else if ("quarta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(4);
        } else if ("quinta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(5);
        } else if ("sexta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(6);
        } else if ("sábado".equalsIgnoreCase(diaDaSemana) || "sabado".equalsIgnoreCase(diaDaSemana)) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido!");
        }

        System.out.println("Fim!");

        entrada.close();

    }
}
