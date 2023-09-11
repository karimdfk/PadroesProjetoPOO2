public class NissanFactory implements CarroFactory {

    public Carro fazCarro() {
        return new CarroNissan();
    }

    public Acessorios fazAcessorios(){
        return new AcessoriosNissan();
    }

    public Motor fazMotor() {
        return new MotorNissan();
    }
}
