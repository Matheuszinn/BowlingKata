import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        CalculadoraPontuacaoBoliche teste = new CalculadoraPontuacaoBoliche();

        teste.preencherJogo(new int[] { 1, 3, 7, 3, 10, 1, 7, 5, 2, 5, 3, 8, 2, 8, 2, 10, 9, 0 });

        teste.pontuacaoDoJogo();

    }

}
