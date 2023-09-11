import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        long inicio = System.currentTimeMillis();
        int resposta = 0, ajuda,n;
        String caminho, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos arquivos deseja ler?");
        n = sc.nextInt();



        for (int i=1; i<=n; i++){
            caminho = "C:\\Users\\KARIM\\Desktop\\UFU\\4oPeriodo\\POO2\\lab01\\ex1\\src\\textos\\txt";
            num = Integer.toString(i);
            caminho+=num;
            ajuda = LineCounter.leitura(caminho);
            resposta = ajuda + resposta;
        }

        System.out.println(resposta);
        System.out.println(System.currentTimeMillis()-inicio);

    }
}


/*Criador de arquivos
        for (int i=3; i<=1000; i++){
            caminho = "C:\\Users\\12111bsi226\\Desktop\\lab02_poo\\src\\textos\\txt";
            num = Integer.toString(i);
            caminho+=num;
            FileWriter fw = new FileWriter(caminho);
            fw.write("linha1\nlinha2\nlinha3\nlinha4");
            fw.close();
        }
        */