package utils;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Input {
    public static String escolherPosicaoAtaque(List jogadasRealizadas) {
        Scanner input = new Scanner(System.in);
        String posicao="";
        String valuesUpperCase = "ABCDEFGHIJ";
        String valuesLowerCase = "abcdefghij";
        char linha;
        char coluna;
        System.out.println("Escolha uma posição para atacar (Ex: A0 ou J7):");

        String posicaoAtaque = input.nextLine();
        try {
            if (posicaoAtaque.length() == 2) {

                linha = posicaoAtaque.charAt(0);
                coluna = posicaoAtaque.charAt(1);

                if ((valuesUpperCase.contains(String.valueOf(linha)) || valuesLowerCase.contains(String.valueOf(linha))) && Character.isAlphabetic(linha)) {
                    if (valuesUpperCase.contains(String.valueOf(linha)))
                        posicao = posicao + valuesUpperCase.indexOf(linha);
                    if (valuesLowerCase.contains(String.valueOf(linha)))
                        posicao = posicao + valuesLowerCase.indexOf(linha);
                } else  {
                    System.out.println("Primeiro Caractere não é de A-J...");
                    throw new Exception();
                }

                if (Character.isDigit(coluna)) {
                    posicao = posicao + coluna;
                } else {
                    System.out.println("Segundo Caractere não é numérico...");
                    throw new Exception();
                }
                if(!jogadasRealizadas.contains(posicao)){
                    return posicao;
                } else {
                    System.out.println("Posição já utilizada anteriormente...");
                    throw new Exception();
                }

            } else {
                System.out.println("Entrada Inválida. Deve serguir o padrão A5, B9 ou J4, por exemplo...");
                throw new Exception();
            }
        } catch(Exception e) {
            escolherPosicaoAtaque(jogadasRealizadas);
        }
        return "";
    }

    public static String gerarAleatoriamentePosicaoAtaque(List jogadasRealizadas) throws Exception {
        int randomX = new Random().nextInt(10);
        int randomY = new Random().nextInt(10);
        String posicao = "";
        posicao = posicao + randomX + randomY;
        try{
            if(!jogadasRealizadas.contains(posicao)){
                return posicao;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            gerarAleatoriamentePosicaoAtaque(jogadasRealizadas);
        }
        return "";
    }
}
