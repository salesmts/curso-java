package classe.desafio;

public class Jantar {
    
    public static void main(String[] args) {
        
        Comida c1 = new Comida("Arroz", 0.150);
        Comida c2 = new Comida("Feijão", 0.100);
        Comida c3 = new Comida("Frango", 0.150);

        Pessoa p = new Pessoa("Matheus", 88.0);
        
        System.out.println(p.aprensentarPessoa());
        p.comer(c1);

        System.out.println(p.aprensentarPessoa());
        p.comer(c2);

        System.out.println(p.aprensentarPessoa());
        p.comer(c3);

        System.out.println(p.aprensentarPessoa());
    }       
}
