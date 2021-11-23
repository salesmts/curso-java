package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        System.out.println(carro1.estaLigado());

        carro1.ligar();

        System.out.println(carro1.estaLigado());

        System.out.println(carro1.motor.rotacaoMotor());

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        System.out.println(carro1.motor.rotacaoMotor());

        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();


        // Faltou encapsulamento!
        // carro1.motor.fatorInjecao = -30;

        System.out.println(carro1.motor.rotacaoMotor());

        // Rela��o bidirecional -> N�o � padr�o, � mais utilizada a unidirecional, para manter a conscist�ncia entre os obj.
        System.out.println(carro1.motor.carro.motor.carro.motor.rotacaoMotor());
    }
}
