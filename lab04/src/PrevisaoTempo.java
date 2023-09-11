import java.util.ArrayList;

public class PrevisaoTempo implements Observable{
    protected int temperatura, umidade, chuva, velocidadeVento;
    ArrayList<Observer> assinantes = new ArrayList<Observer>();

    public PrevisaoTempo(int temperatura, int umidade, int chuva, int velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;
        this.velocidadeVento = velocidadeVento;
    }

    @Override
    public void adicionaObs(Observer o) {
        assinantes.add(o);
    }

    @Override
    public void removeObs(int o) {
        assinantes.remove(o);
    }

    @Override
    public void notifica() {
        for (Observer o:assinantes) {
            o.Atualiza(this);
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getUmidade() {
        return umidade;
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
    }

    public int getChuva() {
        return chuva;
    }

    public void setChuva(int chuva) {
        this.chuva = chuva;
    }

    public int getVelocidadeVento() {
        return velocidadeVento;
    }

    public void setVelocidadeVento(int velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }
}
