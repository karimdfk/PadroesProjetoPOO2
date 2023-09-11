public class Jornal implements Observer{
    @Override
    public void Atualiza(PrevisaoTempo o) {
        System.out.println("Temperatura, Umidade ou Chuva foram alterados");
        System.out.println("Temperatura: " + o.getTemperatura());
        System.out.println("Umidade: " + o.getUmidade());
        System.out.println("Chuva: " + o.getChuva());
    }
}
