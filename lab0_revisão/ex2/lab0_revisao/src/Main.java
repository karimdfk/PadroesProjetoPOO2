import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*Exercicio 2*/
public class Main {
    public static void main(String[] args) {
        String nome;
        char aux;
        int i;
        boolean resposta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        nome = sc.nextLine();

        char c[] = new char[nome.length()];

        c = nome.toCharArray();

        Arrays.sort(c);

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        int cont;
        i=0;

            aux = c[0];
            while (i<nome.length()){
                cont = 1;
                if(i<nome.length()-1){
                    while (aux == c[i+1]){
                        cont++;
                        i++;

                        if(i>=nome.length()-1){
                            break;
                        }

                    }
                }
                i++;
                hm.put(aux, cont);
                if(i<nome.length()){
                    aux=c[i];
                }

            }



        System.out.println(hm);


    }
}