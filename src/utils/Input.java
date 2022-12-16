package utils;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Input {

    //private final Scanner input = new Scanner(System.in);

    public static String escolherPosicaoAtaque() {
        Scanner input = new Scanner(System.in);
        String posicao = new String();
        String valuesUpperCase = "ABCDEFGHIJ";
        String valuesLowerCase = "abcdefghij";

        System.out.println("Escolha uma posição para atacar (Ex: A0 ou J7):");

        String posicaoAtaque = input.nextLine();
        try {
            if (posicaoAtaque.length() == 2) {

                char linha = posicaoAtaque.charAt(0);
                char coluna = posicaoAtaque.charAt(1);

                if ((valuesUpperCase.contains(String.valueOf(linha)) || valuesLowerCase.contains(String.valueOf(linha))) && Character.isAlphabetic(linha)) {
                    if (valuesUpperCase.contains(String.valueOf(linha))) posicao = posicao + valuesUpperCase.indexOf(linha);
                    if (valuesLowerCase.contains(String.valueOf(linha))) posicao = posicao + valuesLowerCase.indexOf(linha);
                } else  {
                    System.out.println("PRIMEIRO IF");
                    throw new Exception();
                }

                if ((coluna >= 0 || coluna <= 9) && Character.isDigit(coluna)) {
                    posicao = posicao + coluna;
                } else {
                    System.out.println("SEGUNDO IF");
                    throw new Exception();
                }
                System.out.println("===========" + posicao);
                return posicao;
            } else {
                System.out.println("TERCEIRO IF");
                throw new Exception();
            }
        } catch(Exception e) {
            System.out.println("Posição Inválida...");
            escolherPosicaoAtaque();
        }
        return "";
    }

//    private final Display display = new Display();
//
//    public String pegartexto(String message) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(message);
//
//        String texto = "";
//        do {
//            texto = sc.nextLine();
//        }
//        while (texto.length() < 1);
//        return texto;
//    }
//
//    public int pegarInteiro(String message) {
//        System.out.println(message);
//        try {
//            return input.nextInt();
//        } catch (NumberFormatException | InputMismatchException e) {
//            System.out.println("Entrada inválida, tente novamente\n");
//            pegarInteiro(message);
//        }
//        return -1;
//    }
//
//    public int[] converterLetraEmNumero(String coordenada) {
//        try {
//            while (!checaCoordenada(coordenada)) {
//                coordenada = pegartexto("Entrada inválida, tente novamente ").toLowerCase();
//            }
//            char[] letras = "abcdefghij".toCharArray();
//            String letra = coordenada.substring(0, 1).toLowerCase();
//            int linha = new String(letras).indexOf(letra);
//            int coluna = Integer.parseInt(coordenada.substring(1)) - 1;
//            return new int[]{coluna, linha};
//        } catch (NumberFormatException e) {
//            return null;
//        }
//    }
//
//    private boolean checaCoordenada(String coordenada) {
//        if (coordenada.length() == 2) {
//            return coordenada.matches("\\D\\d");
//        } else if (coordenada.length() == 3) {
//            return coordenada.matches("\\D\\d\\d");
//        }
//        return false;
//
//    }
}
