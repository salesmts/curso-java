package controle;

import java.util.Scanner;

public class DesafioNumeroPar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um n�mero: ");
        int numero = entrada.nextInt();

        if(numero > 0 && numero < 10){
            if(numero % 2 == 0){
                System.out.println("O n�mero " + numero + " est� entre 0 e 10 e � par.");
            } else {
                System.out.println("O n�mero " + numero + " est� entre 0 e 10 e � �mpar.");
            }
        } else {
            System.out.println("O n�mero n�o est� entre 0 e 10.");
        }

        entrada.close();
    }
}
