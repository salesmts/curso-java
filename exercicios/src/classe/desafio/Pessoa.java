package classe.desafio;

public class Pessoa {
    
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null);
            this.peso += comida.peso;
    }

    String aprensentarPessoa() {
        return "Oi, meu nome é " + nome + " e peso " + peso + " kgs.";
    }
}
