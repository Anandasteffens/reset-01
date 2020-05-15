import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppBatalha {


    public static void main(String[] args) {

        LocalDateTime inicio = LocalDateTime.now();

        Arma espada = new Arma("Espada",22);

        Arma martelo = new Arma("Martelo",10);

        Arma machado = new Arma("Machado",15);

        Arma foice = new Arma("Foice",10);

        Magia raioDeFrio = new Magia ("Raio de Frio", 15,25, false);

        Magia bolaDeFogo = new Magia ("Bola de Fogo", 25,20, false);

        Magia rajadaMistica = new Magia("Rajada Mística", 10, 40, true);

        PoderDivino invocarEnxames = new PoderDivino ("Invocar Enxames",15, 30, false);

        PoderDivino toqueDeFadiga = new PoderDivino ("Toque de Fadiga",30, 25, false);

        PoderDivino ciclone = new PoderDivino("Ciclone", 20, 40, true);

        Guerreiro guerreiro =  CriarPersonagem.criarGuerreiro(espada);

        Barbaro barbaro = CriarPersonagem.criarBarbaro(martelo);

        Mago mago = CriarPersonagem.criarMago(raioDeFrio, 80);

        Feiticeiro feiticeiro = CriarPersonagem.criarFeiticeiro(rajadaMistica, 80);

        Druida druida = CriarPersonagem.criarDruida(invocarEnxames, 50);

        Clerigo clerigo = CriarPersonagem.criarClerigo(ciclone, 50);

        List<String> listaMsg = new ArrayList<>();

        //Escolher quantos personagens quiser - Atividade iniciada:

      /*  List<Personagem> personagens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de usuários deseja criar? ");
        double personagem = scanner.nextDouble();

        for (int i = 0; i < personagem; i++){
            System.out.println("Qual a classe do personagem? ");
            System.out.println(" [ B ] Bárbaro");
            System.out.println(" [ C ] Clérigo");
            System.out.println(" [ D ] Druida");
            System.out.println(" [ F ] Feiticeiro");
            System.out.println(" [ G ] Guerreiro");
            System.out.println(" [ M ] Mago");

            char tipoPersonagem = scanner.next().charAt(0);

            switch (tipoPersonagem) {
                case 'B' :
                    Barbaro barbaro1 = CriarPersonagem.criarBarbaro(martelo);
                    personagens.add(barbaro1);
                    break;
                case 'C' :
                    Clerigo clerigo1 = CriarPersonagem.criarClerigo(ciclone, 50);
                    personagens.add(clerigo1);
                case 'D' :
                    Druida druida1 = CriarPersonagem.criarDruida(invocarEnxames, 50);
                    personagens.add(druida1);
                    break;
                case 'F':
                    Feiticeiro feiticeiro1 = CriarPersonagem.criarFeiticeiro(rajadaMistica, 80);
                    personagens.add(feiticeiro1);
                    break;
                case 'G':
                    Guerreiro guerreiro1 = CriarPersonagem.criarGuerreiro(espada);
                    personagens.add(guerreiro1);
                    break;
                case 'M':
                    Mago mago1 = CriarPersonagem.criarMago(raioDeFrio, 80);
                    personagens.add(mago1);
                    break;
            }

        }*/

        //Ataques

        listaMsg.addAll(clerigo.atacar(barbaro));
        listaMsg.addAll(feiticeiro.atacar(guerreiro));
        listaMsg.addAll(guerreiro.atacar(barbaro));
        listaMsg.addAll(guerreiro.atacar(barbaro));
        listaMsg.addAll(mago.atacar(druida));
        listaMsg.addAll(druida.atacar(mago));
        guerreiro.equiparArma(machado);
        listaMsg.addAll(guerreiro.atacar(feiticeiro));
        listaMsg.addAll(feiticeiro.atacar(mago));
        listaMsg.addAll(druida.atacar(clerigo));
        listaMsg.addAll(druida.atacar(feiticeiro));
        listaMsg.addAll(clerigo.atacar(druida));
        listaMsg.addAll(clerigo.atacar(guerreiro));


        for (int i = 0; i< listaMsg.size(); i++){
            System.out.println(listaMsg.get(i));
        }

        //Imprimir status:
        System.out.println("Imprimir status personagens:");
        guerreiro.imprimirStatus();
        barbaro.imprimirStatus();
        mago.imprimirStatus();
        feiticeiro.imprimirStatus();
        clerigo.imprimirStatus();
        druida.imprimirStatus();

        LocalDateTime fim = LocalDateTime.now();

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração da partida: " + duracao.toSeconds()+ "s " + duracao.toMillisPart() + "ms");

    }
}
