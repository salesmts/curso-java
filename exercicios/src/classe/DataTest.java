package classe;

public class DataTest {

    public static void main(String[] args) {

    Data data1 = new Data(24, 3 , 1998);
    // data1.dia = 24;
    // data1.mes = 3;
    // data1.ano = 1998;

    Data marcoZero = new Data();
    
    
    System.out.printf("A data do meu nascimento é: %d / %d /%d\n", data1.dia, data1.mes, data1.ano);
    System.out.println("A data do meu nascimento é: " + data1.obterDataFormatada());
    System.out.printf("O marco zero é: %d/%d/%d", marcoZero.dia, marcoZero.mes, marcoZero.ano);

    }
}
