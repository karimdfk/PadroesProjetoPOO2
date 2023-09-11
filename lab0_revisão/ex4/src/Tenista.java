public class Tenista extends Atleta {
    private int ranking;

    public Tenista(String nome, float peso, float altura, int idade, int ranking) {
        super(nome, peso, altura, idade);
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void aquecer(int min){
        super.aquecer(min);
    }

    public void jogar(){
        System.out.println("Jogando tenis");
    }



}
