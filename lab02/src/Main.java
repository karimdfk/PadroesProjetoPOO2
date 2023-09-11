public class Main {
    public static void main(String[] args) {
        CarroFactory ff = new FordFactory();
        CarroFactory tf = new ToyotaFactory();
        CarroFactory nf = new NissanFactory();

        Carro cf = ff.fazCarro();
        cf.dirigir();
        Acessorios af = ff.fazAcessorios();
        af.mensagemAcessorios();
        Motor mf = ff.fazMotor();
        mf.ligarMotor();

        Carro ct = tf.fazCarro();
        ct.dirigir();
        Acessorios at = tf.fazAcessorios();
        at.mensagemAcessorios();
        Motor mt = tf.fazMotor();
        mt.ligarMotor();

        Carro cn = nf.fazCarro();
        cn.dirigir();
        Acessorios an = nf.fazAcessorios();
        an.mensagemAcessorios();
        Motor mn = nf.fazMotor();
        mn.ligarMotor();

    }
}