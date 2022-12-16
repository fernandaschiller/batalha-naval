import tabuleiro.Jogador;
import tabuleiro.Tabuleiro;
import utils.Display;
import utils.Input;
import java.util.ArrayList;
import java.util.List;

public class BatalhaNaval {
    public static void main(String[] args) throws Exception {

        Tabuleiro tabuleiroPC = new Tabuleiro();
        Tabuleiro tabuleiroHumano = new Tabuleiro();
        List<String> jogadasPC = new ArrayList();
        List<String> jogadasHumano = new ArrayList();
        Jogador jogadorPC = new Jogador();
        Jogador jogadorHumano = new Jogador();
        Display display = new Display();
        String posicao;
        Input entrada = new Input();

        System.out.println("\n---------------------------------------------");
        System.out.println("|               " + "BATALHA NAVAL               |");

        while (true){ // falta verificar quando alguém ganha
            //falta mesclar os tabuleiros

            //Mostrar o tabuleiro do jogador humano
            display.imprimirTabuleiro(tabuleiroHumano);

            //jogador humano é quem começa escolhendo a posição de ataque
            posicao = entrada.escolherPosicaoAtaque(jogadasHumano);
            jogadasHumano.add(posicao);

            System.out.println("Humano ------>" + posicao);

            //ataque do humano no tabuleiro do PC
            tabuleiroPC = jogadorHumano.atacar(tabuleiroPC, posicao);

            //vez do PC jogar
            posicao = entrada.gerarAleatoriamentePosicaoAtaque(jogadasPC);
            jogadasPC.add(posicao);

            System.out.println("PC ------>" + posicao);

            //ataque do PC no tabuleiro do humano
            tabuleiroHumano=jogadorPC.atacar(tabuleiroHumano, posicao);

        }
//        System.out.println("Tabuleiro Jogador Humano");
//        display.imprimirTabuleiro(tabuleiroHumano);
//        System.out.println("Tabuleiro PC");
//        display.imprimirTabuleiro(tabuleiroPC);
//        System.out.println("FIM DA BATALHA...");
    }
}
