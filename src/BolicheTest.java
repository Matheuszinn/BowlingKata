import java.util.Scanner;

public class BolicheTest {

    public static void main(String[] args) {

        CalculadoraPontuacaoBoliche teste = new CalculadoraPontuacaoBoliche();

        System.out.println(teste.pontuacaoDoJogo(preencherJogoCompletoManual()));

    }

    static int[] jogoCompletoComSpareEStrike() {
        return new int[] {1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8,6};
    }

    static int[] jogoComStrike(){
        return new int[] {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10, 2,3, 0,0};
    }

    static int[] jogoComSpare(){
        return new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 8, 2, 3, 0,0};
    }

    static int[] jogoPerfeito(){
        return new int[] {10 , 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    }

    static int[] preencherJogoCompletoManual(){

        Scanner in = new Scanner(System.in);

        int [] jogadas = new int[21];
        int numJogadas = 0;
        int qntidadePinos, restoPraDez;

        for(int rodadas = 0; rodadas < 11;rodadas++){

            //Checks if the 10th is a spare
            if (rodadas == 10 && (jogadas[numJogadas - 1] + jogadas[numJogadas - 2] == 10)){
                jogadas[numJogadas] = in.nextInt();
                break;
            }else if(rodadas == 10 && jogadas[numJogadas - 1] == 10){ //Checks if the 10th frame is a strike
                qntidadePinos = in.nextInt();
                jogadas[numJogadas] = qntidadePinos;
                numJogadas++;

                jogadas[numJogadas] = in.nextInt();
                break;
            }else if(rodadas == 10){break;} /*Breaks the loop if in the 10th frame the player
                                              didn't scored a strike/spare */

            //Insert the pins quantity in each row

            do{
                System.out.printf("Rodada %d: ",rodadas + 1);
                qntidadePinos = in.nextInt();
            }while(qntidadePinos < 0 || qntidadePinos >10);

            if(qntidadePinos == 10){
                jogadas[numJogadas] = qntidadePinos;
                numJogadas++;
            }else{
                jogadas[numJogadas] = qntidadePinos;
                numJogadas++;

                do {
                    restoPraDez = in.nextInt();
                }while (restoPraDez + qntidadePinos > 10);

                jogadas[numJogadas] = restoPraDez;
                numJogadas++;

            }
        }
        return jogadas;
    }

}
