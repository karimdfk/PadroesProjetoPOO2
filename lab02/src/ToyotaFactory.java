public class ToyotaFactory implements CarroFactory{

    public Carro fazCarro() {
        return new CarroToyota();
    }

    public Acessorios fazAcessorios(){
        return new AcessoriosToyota();
    }

    public Motor fazMotor() {
        return new MotorToyota();
    }

}
