package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);


        //                                              Valores padrões!
        // byte, short, int, long -> 0
        // float, double -> 0.0
        // boolean -> false
        // char -> '\u0000'
        // Objetos -> null (essa variável não aponta para nenhum end. de memória)
    }
    
    Data(int dia, int mes, int ano) {
        this.dia = dia; // Aqui o "this" foi utilizado para diferenciar, o que é variável de instância, e o que é parâmetro.
        this.mes = mes;
        this.ano = ano;
    }
    
    String obterDataFormatada() {
        final String formato = "%d/%d/%d"; // Variável local, limitada ao escopo do método, somente acessável a partir de sua definição.
        return String.format(formato, dia, mes, ano);

    }
}
