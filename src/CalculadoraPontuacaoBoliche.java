public class CalculadoraPontuacaoBoliche {

    public boolean fezStrike(int[] jogadas,int numLancamento){
        return jogadas[numLancamento] == 10;
    }

    public boolean fezSpare(int[] jogadas, int numLancamento){
        return jogadas[numLancamento] + jogadas[numLancamento + 1] == 10;
    }

    public int pontuacaoDoJogo(int [] jogadas){

        int pontuacao = 0;
        int numLancamento = 0;

        for(int rodada = 0; rodada < 10; rodada++){

            if(fezStrike(jogadas,numLancamento)){
                pontuacao += (10 + jogadas[numLancamento + 1] + jogadas[numLancamento + 2]);
                numLancamento++;

            }else if(fezSpare(jogadas,numLancamento)){

                pontuacao += (10 + jogadas[numLancamento + 2]);
                numLancamento += 2;

            }else{
                pontuacao += (jogadas[numLancamento] + jogadas[numLancamento + 1]);
                numLancamento += 2;

            }
        }
        return pontuacao;
    }

}
