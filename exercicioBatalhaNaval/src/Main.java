import tabuleiro.*;

import java.util.Scanner;

public class Main {

    public static void imprimeTabuleiro(Tabuleiro batalhaNaval){
        System.out.println("---0---1---2---3---4---5---6---7---8---9---");
        for(int i=0;i<batalhaNaval.getTabuleiro().length;i++) {

            System.out.println("------------------------------------------");
            System.out.print((char)('A' + i));
            for (int j = 0; j < batalhaNaval.getTabuleiro().length; j++) {
                System.out.print("|");
                System.out.print(batalhaNaval.getTabuleiro()[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------------------");
    }

    public static Tabuleiro atiraNoTabuleiro(Tabuleiro batalhaNaval, String coordenada){
        if(batalhaNaval.getTabuleiro()[coordenada.toCharArray()[0]-'A'][coordenada.toCharArray()[1]-'0'].isAgua()){
            batalhaNaval.getTabuleiro()[coordenada.toCharArray()[0]-'A'][coordenada.toCharArray()[1]-'0'].setTiroAgua();
        } else if (batalhaNaval.getTabuleiro()[coordenada.toCharArray()[0]-'A'][coordenada.toCharArray()[1]-'0'].isNavio()){
            batalhaNaval.getTabuleiro()[coordenada.toCharArray()[0]-'A'][coordenada.toCharArray()[1]-'0'].setTiroCerteiro();
        }
        return batalhaNaval;
    }

    public static void main(String[] args) {
        Tabuleiro batalhaNaval = new Tabuleiro();
        String outraJogada;
        imprimeTabuleiro(batalhaNaval);
        do {
            System.out.println("escolha uma coordenada para atacar:");
            Scanner teclado = new Scanner(System.in);
            String coordenada = teclado.next();
            System.out.println("a coordenanda escolhida foi: " + coordenada);

            System.out.println("linha : " + coordenada.toCharArray()[0]);
            System.out.println("coluna: " + coordenada.toCharArray()[1]);
            System.out.println(batalhaNaval.getTabuleiro()[coordenada.toCharArray()[0] - 'A'][coordenada.toCharArray()[1] - '0']);//numero letra
            batalhaNaval = atiraNoTabuleiro(batalhaNaval, coordenada);
            imprimeTabuleiro(batalhaNaval);
            System.out.println("deseja realizar outra jogada(s/n)?");
            outraJogada = teclado.next();
        }while(outraJogada.equals("s") || outraJogada.equals("S"));
    }


}