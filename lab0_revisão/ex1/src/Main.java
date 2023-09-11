import java.util.Scanner;

/*Exercicio 1*/

public class Main {
    public static void main(String[] args) {
        String nome1, nome2;
        boolean resposta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1o nome:");
        nome1 = sc.nextLine();
        System.out.println("Digite o 2o nome:");
        nome2 = sc.nextLine();


        if(nome1.endsWith(nome2)){
            resposta = true;
        }
        else {
            resposta = false;
        }

        System.out.println(resposta);


    }
}