import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    private static int c = 0;

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Main.c = c;
    }

    public static void main(String[] args) throws Exception {
        long inicio = System.currentTimeMillis();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos arquivos deseja ler?");
        n = sc.nextInt();



        for (int i=1; i<=n; i++){
            Thread t = new Thread(new LineCounter(i));
            t.start();
            t.join();
        }

        System.out.println(getC());
        System.out.println(System.currentTimeMillis()-inicio);

    }
}


/*Criador de arquivos
        for (int i=3; i<=1000; i++){
            caminho = "C:\\Users\\12111bsi226\\Desktop\\lab02_poo\\ex1\\src\\textos\\txt";
            num = Integer.toString(i);
            caminho+=num;
            FileWriter fw = new FileWriter(caminho);
            fw.write("linha1\nlinha2\nlinha3\nlinha4");
            fw.close();
        }
        */