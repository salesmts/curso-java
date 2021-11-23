package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){
        
    }
   
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    // O objeto já possui preço e desconto, logo, não preciso
    // ter input de preços e descontos nos parâmetros do método!
    double precoComDesconto(){

        double resultado = preco * (1 - desconto);
        return resultado;

    }

    double descontoGerente(double descontoDoGerente){

        double resultado = preco * (1 - desconto - descontoDoGerente);
        return resultado;

    }
}
