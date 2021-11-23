package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Matheus Sales";
        compra1.itens.add(new Item("Caneta", 10, 2.50));
        compra1.itens.add(new Item("Caderno", 10, 15.0));
        compra1.itens.add(new Item("Borracha", 10, 1.80));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getvalorTotal());
    }
}
