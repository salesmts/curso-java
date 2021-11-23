package arrays;

import java.util.Arrays;

public class ExercicioForeach {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 6.5;

        for(double nota: notasAlunoA){
            System.out.println(nota);
        }

        System.out.println();



        double [] notasAlunoB = { 4.5, 8.4, 6.7, 10 };

//        double total = 0;
        for(double nota: notasAlunoB) {
//            total = nota / notasAlunoB.length;
            System.out.println(nota);
        }
    }

}
