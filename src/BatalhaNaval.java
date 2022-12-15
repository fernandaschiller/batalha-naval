import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import utils.Display;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {


//
//    public static String[][] inicializarTabuleiro() {
//
//        String[][] tabuleiro = new String[11][11];
//        Random random = new Random();
//
//        tabuleiro[0][0] = "   ";
//
//        for (int j = 1; j < tabuleiro.length; j++) {
//            tabuleiro[0][j] = " " + (j - 1) + " ";
//        }
//
//        for (int i = 1; i < tabuleiro.length; i++) {
//            tabuleiro[i][0] = " " + (Character.toString((char) 65 + i - 1)) + " ";
//        }
//
//        for (int i = 1; i < tabuleiro.length; i++) {
//
//            int posicaoNavio = random.nextInt(1,11);
//
//            for (int j = 1; j < tabuleiro.length; j++) {
//                if(posicaoNavio == j) {
//                    tabuleiro[i][j] = " N ";
//                } else {
//                    tabuleiro[i][j] = "   ";
//                }
//            }
//        }
//        return tabuleiro;
//    }
//
//    public static void mostrarTabuleiro(String[][] tabuleiro) {
//
//        System.out.println("---------------------------------------------");
//        for (int i = 0; i < tabuleiro.length; i++) {
//            for (int j = 0; j < tabuleiro.length; j++) {
//                System.out.print("|");
//                System.out.print(tabuleiro[i][j]);
//            }
//            System.out.print("|");
//            System.out.println("\n---------------------------------------------");
//        }
//    }
//
//    public static Point escolherPosicaoAtaque(List<Point> jogadas) {
//        Scanner input = new Scanner(System.in);
//        Point posicao = new Point();
//        List<String> values = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
//
//        System.out.println("Escolha uma posição para atacar o oponente:");
//        System.out.println("Linha (A-J): ");
//        String linhaLetra = input.next();
//        System.out.println("Coluna (0-9): ");
//        int coluna = input.nextInt();
//        int linha = values.indexOf(linhaLetra);
//
//        linha++;
//        coluna++;
//        posicao.x = linha;
//        posicao.y = coluna;
//
//        jogadas.add(posicao);
//
//        return posicao;
//    }
//
//    public static String[][] atacar(String[][] tabuleiro, Point posicao) {
//
//        if (tabuleiro[posicao.x][posicao.y].equals("   ")) {
//            tabuleiro[posicao.x][posicao.y] = " - ";
//        } else if (tabuleiro[posicao.x][posicao.y].equals(" N ")) {
//            tabuleiro[posicao.x][posicao.y] = " * ";
//        }
//
//        return tabuleiro;
//    }

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro();
        Display display = new Display();

        display.imprimirTabuleiro(tabuleiro);


//        List<Point> jogadasPC = new ArrayList<>();
//        List<Point> jogadasPessoa = new ArrayList<>();
//
//
//
//        Point posicao = new Point();
//        System.out.println();
//        System.out.println("---------------------------------------------");
//        System.out.println("                " + "BATALHA NAVAL");
//        String[][] tabuleiroPessoa = inicializarTabuleiro();
//        String[][] tabuleiroPC = inicializarTabuleiro();
//
//
//        while (true){ // melhorar condição
//            // falta mesclar os tabuleiros
//
//            mostrarTabuleiro(tabuleiroPessoa);
//            posicao = escolherPosicaoAtaque(jogadasPessoa); // posição escolhida pelo jogador pessoa
//            System.out.println(posicao);
//            tabuleiroPC = atacar(tabuleiroPC, posicao);
//
//            mostrarTabuleiro(tabuleiroPessoa);
//            posicao = escolherPosicaoAtaque(jogadasPC); // posição deve ser escolhida aleatoriamente pelo jogador PC
//            System.out.println(posicao);
//            tabuleiroPessoa = atacar(tabuleiroPessoa, posicao);
//        }
    }
}

// tabuleiro tem função armazenar navios, imprimir tabuleiro... - construir classe chamada tabuliero
// objeto tabuleiro pra pessoa e objeto tabuleiro para o computador
