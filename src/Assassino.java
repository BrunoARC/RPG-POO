public class Assassino extends Arquetipos implements CorpoACorpo {
    private double chanceEvasao;
    private double chanceCritica;

    public Assassino(String nome, int nivel) {
        super(nome, nivel, "Assassino");
    }

    public double getChanceEvasao() {
        return chanceEvasao;
    }

    public void setChanceEvasao(double chanceEvasao) {
        this.chanceEvasao = chanceEvasao;
    }

    public double getChanceCritica() {
        return chanceCritica;
    }

    public void setChanceCritica(double chanceCritica) {
        this.chanceCritica = chanceCritica;
    }

    public void ataqueDuplo() {
        System.out.println(getNome() + " realiza um ataque duplo veloz!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " entra nas sombras e prepara um golpe crítico!");
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com suas adagas afiadas!");
    }

    @Override
    public void defender(int dano) {
        System.out.println(getNome() + " tenta esquivar de " + dano + " de dano usando sua agilidade.");
    }
}
