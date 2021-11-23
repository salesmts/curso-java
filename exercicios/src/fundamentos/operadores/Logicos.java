package fundamentos.operadores;

import static java.lang.System.out;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		out.println(condicao1 && !condicao2);
		out.println(condicao1 || condicao2);
		out.println(condicao1 ^ condicao2);
		out.println(!!condicao1);
		out.println(!condicao2);
		
		out.println("Tabela verdade E (AND)");
		out.println(true && true);
		out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);

		
		out.println("\nTabela verdade OU (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		out.println(false || true);
		out.println(false || false);
		
		out.println("\nTabela verdade OU Exclusivo (XOR)");
		out.println(true ^ true);
		out.println(true ^ false);
		out.println(false ^ true);
		out.println(false ^ false);
		
		out.println("\nTabela verdade Negação (NOT)");
		out.println(!true);
		out.println(!false);

	}
}
