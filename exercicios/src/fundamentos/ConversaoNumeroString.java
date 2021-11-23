package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // Jeitos melhores!
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // Jeitos melhores!
		
		System.out.println((""+ num1).length()); // Modo menos correto!
		System.out.println((""+ num2).length());
	}
}
