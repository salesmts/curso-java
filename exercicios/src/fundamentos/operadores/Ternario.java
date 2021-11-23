package fundamentos.operadores;

import static java.lang.System.out;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.6;
        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
        String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;

        out.println("O aluno está " + resultadoFinal);


        double nota = 9.0;
        boolean bomComportamento = true;
        boolean passouMedia = nota >= 7.0;
        boolean temDesconto = bomComportamento && passouMedia;
        String resultadoDesconto = temDesconto ? "Sim!" : "Não!";

        out.println("Tem desconto? " + resultadoDesconto);

    }
}
