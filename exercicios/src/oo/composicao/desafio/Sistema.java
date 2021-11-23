package oo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItens("Caneta", 2.50, 100);
        compra1.adicionarItens(new Produto("Notebook", 4000), 5);

        Compra compra2 = new Compra();
        compra2.adicionarItens(new Produto("Caderno", 20.0),5);
        compra2.adicionarItens(new Produto("Mesa", 400.0),5);

        Cliente cliente = new Cliente("Matheus Sales");

        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        double total = cliente.obterValorTotal();
        System.out.println("O valor total da compra ?: R$ " + total);
    }
}
