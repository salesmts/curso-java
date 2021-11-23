package fundamentos;


// CAST � evit�vel, prefer�vel usar o int e double como padr�o!

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; // impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345412415543546436346; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // expl�cita (CAST)
		System.out.println(f);
	}
}
