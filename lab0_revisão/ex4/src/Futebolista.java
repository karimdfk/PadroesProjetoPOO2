public class Futebolista extends Atleta {
    private String time;

    public Futebolista(String nome, float peso, float altura, int idade, String time) {
        super(nome, peso, altura, idade);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void aquecer(int min){
        super.aquecer(min);
    }

    public void jogar() {
        System.out.println("Jogando futebol");
    }




}
