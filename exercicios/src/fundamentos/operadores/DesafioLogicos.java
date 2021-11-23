package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        // Se somente um trabalho der certo, compro a TV de 32", se os dois derem certo compro a de 50".
        // Em ambos os casos irei tomar sorvete com a família.
        // Se nenhum dos trabalho der certo, não irei sair de casa.

        boolean trabalho1 = false;
        boolean trabalho2 = false;
        boolean tvMaior = trabalho1 && trabalho2;
        boolean tvMenor = trabalho1 ^ trabalho2;
        boolean tomouSorvete = trabalho1 || trabalho2;
        // Operador unário!
        boolean maisSaudavel = !tomouSorvete;

        System.out.println("Comprou TV 50\"? " + tvMaior);
        System.out.println("Comprou TV 32\"? " + tvMenor);
        System.out.println("Tomou sorvete\"? " + tomouSorvete);
        System.out.println("Mais saudável\"? " + maisSaudavel);
    }
}
