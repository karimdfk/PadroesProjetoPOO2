public class FordFactory implements CarroFactory{

    public Carro fazCarro() {
        return new CarroFord();
    }

    public Acessorios fazAcessorios(){
        return new AcessoriosFord();
    }

    public Motor fazMotor() {
        return new MotorFord();
    }
}
