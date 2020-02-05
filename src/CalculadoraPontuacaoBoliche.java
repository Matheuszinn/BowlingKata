public class CalculadoraPontuacaoBoliche {

    /*private int[] pinosDerrubados = new int[21];

    public void preencherJogo(int[] jogoPreenchido){
        for(int i = 0; i < jogoPreenchido.length; i++){
            pinosDerrubados[i] = jogoPreenchido[i];
        }
    }*/

    public boolean fezStrike(int[] jogadas, int numLancamento){
        return jogadas[numLancamento] == 10;
    }

    public boolean fezSpare(int[] jogadas, int numLancamento){
        return jogadas[numLancamento] + jogadas[numLancamento + 1] == 10;
    }

    public int pontuacaoDoJogo(int[] jogadas){

        int potuacao = 0;
        int numLancamento = 0;

        for(int i:jogadas){
            System.out.println(i);
        }

        return 0;
    }


}
