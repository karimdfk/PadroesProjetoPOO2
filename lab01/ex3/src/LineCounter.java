import java.io.FileReader;
import java.io.LineNumberReader;

public class LineCounter extends Thread{

    public LineCounter() {
    }

    public static int leitura(String caminho) throws Exception{
        FileReader file = new FileReader(caminho);
        LineNumberReader lnr = new LineNumberReader(file);
        String linha;
        int num;

        while (true){
            linha = lnr.readLine();
            if(linha == null){
                num = lnr.getLineNumber();
                lnr.close();
                return num;
            }
        }
    }


}