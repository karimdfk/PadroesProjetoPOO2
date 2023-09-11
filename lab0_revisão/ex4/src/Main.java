import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Atleta atleta[] = new Atleta[3];
        ArrayList<Atleta> listAtleta = new ArrayList<>();

        atleta[0] = new Futebolista("Jose", 70f, (float) 1.70f, 23, "Cruzeiro");
        atleta[1] = new Tenista("Joao", 65f, (float) 1.80, 20, 18);
        atleta[2] = new Corredor("Alex", 75f, (float) 1.65, 22);

        Atleta a1 = new Futebolista("Caio", 70f, (float) 1.70f, 23, "America");
        Atleta a2 = new Tenista("Andre", 65f, (float) 1.80, 20, 34);
        Atleta a3 = new Corredor("Pedro", 75f, (float) 1.65, 22);

        listAtleta.add(a1);
        listAtleta.add(a2);
        listAtleta.add(a3);

        Arrays.sort(atleta);
        Collections.sort(listAtleta);


        for(Atleta a : listAtleta){
            System.out.println(a.toString());
            a.aquecer(20);
            a.jogar();
        }

        for(int i=0; i<3; i++){
            System.out.println(atleta[i].getNome());
            atleta[i].aquecer(15);
            atleta[i].jogar();
        }

        LocalDate olimpiada = Atleta.calcularProximaOlimpiada();

        System.out.println(olimpiada);

    }
}