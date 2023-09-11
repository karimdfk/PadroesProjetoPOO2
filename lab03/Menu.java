import java.util.Scanner;

public class Menu {
    public static void menu() {
        int x = 0;

        Personagem c = new Personagem();
        BuilderPersonagem bp = new BuilderPersonagem(c);

        while (x != 7) {
            System.out.println("Escolha uma opção");
            System.out.println("Criar novo personagem (1)");
            System.out.println("Escolher nome (2)");
            System.out.println("Escolher Profissão (3)");
            System.out.println("Escolher Equipamento(4)");
            System.out.println("Aleatório (5)");
            System.out.println("Resetar personagem (6)");
            System.out.println("Personagem Finalizado (7)");

            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            sc.nextLine();

            if (x == 1) {
                Personagem p = new Personagem();
                bp.setP(p);
            }
            if (x == 2) {
                System.out.println("Digite o nome do seu personagem: ");
                String nome = sc.nextLine();
                sc.nextLine();
                bp.criaNome(nome);
            }
            if (x == 3) {
                System.out.println("Escolha sua Profissão: ");
                System.out.println("Guerreiro (1)");
                System.out.println("Mago (2)");
                System.out.println("Arqueiro (3)");
                int num = sc.nextInt();
                sc.nextLine();

                if (num == 1) {
                    bp.criaProfissao("Guerreiro");
                }
                if (num == 2) {
                    bp.criaProfissao("Mago");
                }
                if (num == 3) {
                    bp.criaProfissao("Arqueiro");
                }
            }
            if (x == 4) {
                System.out.println("Escolha seu Equipamento: ");
                System.out.println("Espada (1)");
                System.out.println("Cajado (2)");
                System.out.println("Arco (3)");
                int num = sc.nextInt();
                sc.nextLine();

                if (num == 1) {
                    bp.criaEquipamento("Espada");
                }
                if (num == 2) {
                    bp.criaEquipamento("Cajado");
                }
                if (num == 3) {
                    bp.criaEquipamento("Arco");
                }
            }
            if (x == 5) {
                bp.criaNome("Robertão");
                bp.criaEquipamento("Espada");
                bp.criaProfissao("Mago");
            }
            if (x == 6) {
                bp.reset();
            }
            if (x == 7) {
                Personagem per = bp.getResult();
                System.out.println(per.toString());
            }


        }
    }
}
