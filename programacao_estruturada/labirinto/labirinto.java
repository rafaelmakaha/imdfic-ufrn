public class labirinto {
    private static final char PAREDE_HORIZONTAL = '-';
    private static final char PAREDE_VERTICAL = '|';
    private static final char PAREDE_INTERNA = '@';
    private static final char VAZIO = ' ';
    private static final char DESTINO = 'D';
    private static final char INICIO = 'I';
    private static int linhaInicio;
    private static int colunaInicio;
    private static final int TAMANHO = 10;
    private static final double PROBABILIDADE = 0.7;
    private static char[][] tabuleiro;

    public static int gerarNumero(int minimo, int maximo) {
        int valor = (int) Math.round(Math.random()  * (maximo - minimo));
        return minimo + valor;
    }

    private static void inicializarMatriz(){
        for(int i=0; i < TAMANHO; i++){
            tabuleiro[i][0] = PAREDE_VERTICAL;
            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;
            tabuleiro[0][i] = PAREDE_HORIZONTAL;
            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;
        }
        for(int i=1; i < TAMANHO - 1; i++){
            for(int j=1; j < TAMANHO - 1; j++){
                if(Math.random() > PROBABILIDADE){
                    tabuleiro[i][j] = PAREDE_INTERNA;
                }else{
                    tabuleiro[i][j] = VAZIO;
                }
            }
        }
        linhaInicio = gerarNumero(1, TAMANHO / 2 - 1);
        colunaInicio = gerarNumero(1, TAMANHO / 2 - 1);
        tabuleiro[linhaInicio][colunaInicio] = INICIO;

        int linhaDestino = gerarNumero(TAMANHO / 2, TAMANHO - 2);
        int colunaDestino = gerarNumero(TAMANHO / 2, TAMANHO - 2);
        tabuleiro[linhaDestino][colunaDestino] = DESTINO;
    }

    private static void imprimir(){
        for(int i=0; i < TAMANHO; i++){
            for(int j=0; j < TAMANHO; j++){
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tabuleiro = new char[TAMANHO][TAMANHO];
        inicializarMatriz();
        imprimir();
    }
}