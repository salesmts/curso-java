package fundamentos;


public class DesafioVariaveisConstantes {
	public static void main(String[] args) {
		
		// (�F - 32) x 5/9 = �C
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		double TempF = 60.0;
		double TempC = (TempF - AJUSTE) * FATOR;
		
		System.out.println("A temperatura em ºC é: " +TempC + ".");
		
		
	}
}
