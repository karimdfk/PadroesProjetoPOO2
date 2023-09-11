import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_aleatorio, num_usuario;
        Random rdm = new Random();

        num_aleatorio = rdm.nextInt(100);

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivinhe o número: ");
        num_usuario = sc.nextInt();

        while (num_aleatorio!=num_usuario){
            if(num_aleatorio>num_usuario){
                System.out.println("Seu chute foi baixo demais, tente novamente: ");
        num_usuario = sc.nextInt();
        }
        else {
        System.out.println("Seu chute foi alto demais, tente novamente: ");
        num_usuario = sc.nextInt();
        }
        }

        System.out.println("Seu chute foi correto!");
    }
}