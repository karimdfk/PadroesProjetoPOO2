public class BuilderPersonagem implements Builder{
    private Personagem p;

    public BuilderPersonagem(Personagem p) {
        this.p = p;
    }

    public Personagem getP() {
        return p;
    }

    public void setP(Personagem p) {
        this.p = p;
    }

    @Override
    public void reset() {
        this.p = new Personagem();
    }

    @Override
    public void criaNome(String nome) {
        p.setNome(nome);
    }

    @Override
    public void criaProfissao(String profisao) {
        p.setProfissao(profisao);
    }

    @Override
    public void criaEquipamento(String equipamento) {
        p.setEquipamento(equipamento);
    }

    public Personagem getResult(){
        return this.p;
    }
}
