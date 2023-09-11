import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public abstract class Atleta implements Comparable<Atleta> {
    private String nome;
    private float peso, altura;
    private int idade;

    public Atleta(String nome, float peso, float altura, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void aquecer(int minutos){
        System.out.println("O atleta aqueceu por" + minutos + "minutos");
    }

    public abstract void jogar();

    static LocalDate calcularProximaOlimpiada(){
        LocalDate olimpiadas = LocalDate.of(2024,07,26);
        LocalDate atual = LocalDate.now();
        int resposta = (int) ChronoUnit.DAYS.between(atual,olimpiadas);

        System.out.println(resposta);

        return olimpiadas;
    }


    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Atleta o) {
        if (this.nome.compareTo(o.getNome()) < 0){
            return -1;
        }
        else if (this.nome.compareTo(o.getNome()) > 0){
            return 1;
        }
        return 0;
    }
}
