package controle;

import java.util.Scanner;

public class DesafioWhile {
    // Calcular m�dia das notas de uma turma
    // Nota v�lida, nota inv�lida
    //
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.print("Informe a nota(ou -1 para sair): ");
            nota = entrada.nextDouble();

        if (nota <= 10 && nota >= 0){
            total += nota;
            quantidadeDeNotas++;
        } else if (nota != -1) {
            System.out.println("Nota inv�lida!");
        }
        }

        //Calcula m�dia

        double media = total / quantidadeDeNotas;
        System.out.println("A m�dia das notas �: " + media);

        System.out.println("Quantidade de notas: " + quantidadeDeNotas);

        entrada.close();

    }
}
