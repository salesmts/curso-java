package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
//		
//		int a = 2 + 3 * 4;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
		
		
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2) / (3 * 2);
		
		int x = (1-5) * (2-7) / 2;
		int y = (int) Math.pow(x, 2);
		
		int z = b - y;
		int w = (int) Math.pow(z, 3);
		
		int r = (int) Math.pow(10, 3);
		
		int t = w / r;
		
		System.out.println(t);
		
		
	}
}
