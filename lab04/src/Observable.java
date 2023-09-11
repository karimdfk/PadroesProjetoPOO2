public interface Observable {
    public void adicionaObs(Observer o);
    public void removeObs(int o);
    public void notifica();
}
