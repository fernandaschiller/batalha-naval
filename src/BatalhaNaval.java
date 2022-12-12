import java.util.Random;

public class BatalhaNaval {

    public static String[][] inicializarTabuleiro() {

        String[][] tabuleiro = new String[11][11];
        Random random = new Random();

        tabuleiro[0][0] = "   ";

        for (int j = 1; j < tabuleiro.length; j++) {
            tabuleiro[0][j] = " " + (j - 1) + " ";
        }

        for (int i = 1; i < tabuleiro.length; i++) {
            tabuleiro[i][0] = " " + (Character.toString((char) 65 + i - 1)) + " ";
        }

        for (int i = 1; i < tabuleiro.length; i++) {

            int posicaoNavio = random.nextInt(1,11);

            for (int j = 1; j < tabuleiro.length; j++) {
                if(posicaoNavio == j) {
                    tabuleiro[i][j] = " N ";
                } else {
                    tabuleiro[i][j] = " ~ ";
                }
            }
        }
        return tabuleiro;
    }

    public static void mostrarTabuleiro(String[][] tabuleiro) {

        System.out.println("---------------------------------------------");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.print("|");
                System.out.print(tabuleiro[i][j]);
            }
            System.out.print("|");
            System.out.println("\n---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("                " + "BATALHA NAVAL");
        String[][] tabuleiro = inicializarTabuleiro();
        mostrarTabuleiro(tabuleiro);

    }
}