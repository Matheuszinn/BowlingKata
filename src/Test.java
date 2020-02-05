import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        CalculadoraPontuacaoBoliche teste = new CalculadoraPontuacaoBoliche();

        System.out.println(teste.pontuacaoDoJogo(jogoCompletoComSpareEStrike()));

    }

    static int[] jogoCompletoComSpareEStrike(){

        return new int[] {1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8,6};
    }

    static int[] jogoComStrike(){
        return new int[] {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10, 2,3, 0,0};
    }
    
}
