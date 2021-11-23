package fundamentos;

import java.util.Scanner;

// Receber 3 strings via Scanner, �ltimos tr�s sal�rios, calcular a m�dia.
// O funcion�rio pode separar as casas decimais utilizando ponto ou v�rgula!

public class DesafioConversao {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Entradas dos sal�rios do usu�rio
		// Atribui��o das �s entradas �s vari�veis
		System.out.print("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo sal�rio: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro sal�rio: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		// Convers�o utilizando .parseDouble String -> Double
		double salarioUm = Double.parseDouble(salario1);
		double salarioDois = Double.parseDouble(salario2);
		double salarioTres = Double.parseDouble(salario3);
		
		// Vari�vel que calcula a m�dia dos tr�s sal�rios
		double mediaSalario = (salarioUm + salarioDois + salarioTres) / 3;
		
		// Sa�da da String com a m�dia final
		System.out.printf("A m�dia salarial �: R$%.3f reais. ", mediaSalario);
		
		entrada.close();
		
	}
}
