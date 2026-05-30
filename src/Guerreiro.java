public class Guerreiro extends Arquetipos implements CorpoACorpo {
    private int armadura;
    private int resistenciaFisica;

    public Guerreiro(String nome, int nivel) {
        super(nome, nivel, "Guerreiro");
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getResistenciaFisica() {
        return resistenciaFisica;
    }

    public void setResistenciaFisica(int resistenciaFisica) {
        this.resistenciaFisica = resistenciaFisica;
    }

    public void golpePesado(Personagem personagem) {
        System.out.println(getNome() + " desfere um golpe pesado no "+personagem.getNome()+" com toda a sua força!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " ativa a fúria de batalha, aumentando seu dano!");
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " corpo a corpo com sua arma!");
    }

    @Override
    public void defender(int dano) {
        System.out.println(getNome() + " bloqueia " + dano + " de dano com sua armadura.");
    }
}
