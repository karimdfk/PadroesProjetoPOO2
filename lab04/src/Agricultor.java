public class Agricultor implements Observer{
    @Override
    public void Atualiza(PrevisaoTempo o) {
        System.out.println("Temperatura ou Chuva foram alterados");
        System.out.println("Temperatura: " + o.getTemperatura());
        System.out.println("Chuva: " + o.getChuva());
    }
}
