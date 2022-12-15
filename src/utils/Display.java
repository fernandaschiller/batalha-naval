package utils;

import tabuleiro.Tabuleiro;

public class Display {

    public static void imprimirTabuleiro (Tabuleiro tabuleiro) {

        System.out.println("---------------------------------------------");
        System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < tabuleiro.TAMANHO_TABULEIRO; i++) {
            System.out.print("| " + (Character.toString((char) 65 + i)) + " ");
            for (int j = 0; j < tabuleiro.TAMANHO_TABULEIRO; j++) {
                System.out.print("|");
                System.out.print(tabuleiro.getTabuleiro()[i][j]);
            }
            System.out.print("|");
            System.out.println("\n---------------------------------------------");
        }
    }
}

