package arrays;

import java.util.Scanner;

public class DesafioArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar? ");
        int numeroNotas = scanner.nextInt();

        double[] notasAluno = new double[numeroNotas];


        for (int i = 0; i < notasAluno.length; i++) {

            System.out.println("Informe a nota " + (i + 1) + ": ");
            notasAluno[i] = scanner.nextDouble();
        }

        double total = 0;
        for(double nota: notasAluno) {
            total += nota;
        }

        double media = total / notasAluno.length;
        System.out.printf("A média do aluno é: %.2f", media);

        scanner.close();
    }
}
