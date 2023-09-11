import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCounter implements Runnable{
    private String num;

    public LineCounter(Integer num) {
        this.num = num.toString();
    }


    public void run(){
        try {
            FileReader file = new FileReader("C:\\Users\\KARIM\\Desktop\\UFU\\4oPeriodo\\POO2\\lab01\\ex1\\src\\textos\\txt" + num);
            LineNumberReader lnr = new LineNumberReader(file);
            String linha;
            int x = Main.getC();
            int n;

            while ((linha = lnr.readLine()) != null){

                }
            n = lnr.getLineNumber();
            x += n;
            Main.setC(x);
            lnr.close();

            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}