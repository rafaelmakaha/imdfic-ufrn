public class labirinto {
    private static final char PAREDE_HORIZONTAL = '-';
    private static final char PAREDE_VERTICAL = '|';
    private static final char VAZIO = ' ';
    private static final int TAMANHO = 10;
    private static char[][] tabuleiro;

    private static void inicializarMatriz(){
        for(int i=0; i < TAMANHO; i++){
            tabuleiro[i][0] = PAREDE_VERTICAL;
            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;
            tabuleiro[0][i] = PAREDE_HORIZONTAL;
            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;
        }
        for(int i=1; i < TAMANHO - 1; i++){
            for(int j=1; j < TAMANHO - 1; j++){
                tabuleiro[i][j] = VAZIO;
            }
        }
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