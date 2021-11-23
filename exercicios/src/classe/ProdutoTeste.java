package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);
        // p1.nome = "Notebook";
        // p1.preco = 4356.89;
        // p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Azul";
        p2.preco = 2.59;
        
        Produto.desconto = 0.25;

        System.out.println(p1.nome);
        System.out.println(p2.nome); // Quando acesso com .nome, estou chamando um atributo!

        Double precoFinal1 = p1.precoComDesconto(); // Quando chamo com parênteses, estou chamando um método!
        Double precoFinal2 = p2.descontoGerente(0.2);
        System.out.printf("O preço final do notebook é: R$%.2f.%n", precoFinal1);
        System.out.printf("O preço final da caneta é: R$%.2f. ", precoFinal2);
    }
}
