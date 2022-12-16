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
        boolean ganhadorPC = false;
        boolean ganhadorHumano = false;

        System.out.println("\n---------------------------------------------");
        System.out.println("|               " + "BATALHA NAVAL               |");

        while (!ganhadorHumano && !ganhadorPC){
            //falta mesclar os tabuleiros

            //Mostrar o tabuleiro do jogador humano
            display.imprimirTabuleiro(tabuleiroHumano);

            //jogador humano é quem começa escolhendo a posição de ataque
            posicao = entrada.escolherPosicaoAtaque(jogadasHumano);

            //para fazer PC vs PC, descomentar a linha de baixo e comentar a de cima
            //posicao = entrada.gerarAleatoriamentePosicaoAtaque(jogadasHumano);

            jogadasHumano.add(posicao);

            //ataque do humano no tabuleiro do PC
            tabuleiroPC = jogadorHumano.atacar(tabuleiroPC, posicao);

            //verificar se o jogador humano é ganhador
            ganhadorHumano = jogadorHumano.verificarGanhador(tabuleiroPC);
            if (ganhadorHumano){
                break;
            }

            //vez do PC jogar
            posicao = entrada.gerarAleatoriamentePosicaoAtaque(jogadasPC);
            jogadasPC.add(posicao);

            //ataque do PC no tabuleiro do humano
            tabuleiroHumano=jogadorPC.atacar(tabuleiroHumano, posicao);

            //verificar se o jogador PC é ganhador
            ganhadorPC = jogadorPC.verificarGanhador(tabuleiroHumano);
            if (ganhadorPC){
                break;
            }
        }
        if (ganhadorHumano){
            System.out.println("Jogador Humano Venceu!! :D");
        } else {
            System.out.println("Jogador PC Venceu.. :'(");
        }
        System.out.println("Tabuleiro Jogador Humano");
        display.imprimirTabuleiro(tabuleiroHumano);
        System.out.println("Tabuleiro PC");
        display.imprimirTabuleiro(tabuleiroPC);
        System.out.println("FIM DA BATALHA...");
    }
}
