public class Corredor extends Atleta{
    public Corredor(String nome, float peso, float altura, int idade) {
        super(nome, peso, altura, idade);
    }

    public void aquecer(int min){
        super.aquecer(min);
    }

    public void jogar(){
        System.out.println("Praticando corrida");
    }


}
