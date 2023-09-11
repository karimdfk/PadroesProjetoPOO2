import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Menu {
    public static void roda(){
        PrevisaoTempo p = new PrevisaoTempo(20, 10, 5, 20);
        int controlaWhile = 7;
        while (controlaWhile != 0){
            System.out.println("Escolha uma opção: ");
            System.out.println("(1) Adicionar observador");
            System.out.println("(2) Remover observador");
            System.out.println("(3) Executar");

            Scanner sc = new Scanner(System.in);
            int numMenu = sc.nextInt();

            if (numMenu == 1){
                System.out.println("Selecione o tipo de observador");
                System.out.println("(1) Jornal");
                System.out.println("(2) Aeroporto");
                System.out.println("(3) Agricultor");

                int selecao = sc.nextInt();

                if (selecao == 1){
                    Observer o1 = new Jornal();
                    p.adicionaObs(o1);
                }
                if (selecao == 2){
                    Observer o2 = new Aeroporto();
                    p.adicionaObs(o2);
                }
                if (selecao == 3){
                    Observer o3 = new Agricultor();
                    p.adicionaObs(o3);
                }
            }
            else if (numMenu == 2){
                System.out.println("Qual a posição do observador a remover?");
                int numRemove = sc.nextInt();
                p.removeObs(numRemove);
            }
            else if (numMenu == 3) {
                Timer cronometro = new Timer();
                TimerTask tarefa1 = new TimerTask() {
                    @Override
                    public void run() {
                        Random random = new Random();
                        p.setChuva(random.nextInt(100));
                        p.setTemperatura(random.nextInt(40));
                        p.setUmidade(random.nextInt(100));
                        p.setVelocidadeVento(random.nextInt(200));
                        p.notifica();
                    }
                };

                int milissegundos = 1000;
                cronometro.schedule(tarefa1, milissegundos, 10000);
            }
            else if(numMenu == 0){
                controlaWhile = 0;
            }
            else{
                System.out.println("Escolha uma opção válida");
            }
        }

    }
}
