package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // Qual a operação + - * / %
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String operacao = entrada.next();

        // Lógica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;


        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        entrada.close();

//        Scanner entradaNum2 = new Scanner(System.in);
//        int num2 = Integer.parseInt(entradaNum2.next());
//        System.out.println(num2);
//        entradaNum2.close();
//
//        Scanner entradaOperacao = new Scanner(System.in);
//        String operacao = entradaOperacao.next();
//        System.out.println(operacao);
//        entradaOperacao.close();




    }

}
