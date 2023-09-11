public class Aeroporto implements Observer{
    @Override
    public void Atualiza(PrevisaoTempo o) {
        System.out.println("Vento ou Chuva foram alterados");
        System.out.println("Vento: " + o.getVelocidadeVento());
        System.out.println("Chuva: " + o.getChuva());
    }
}
