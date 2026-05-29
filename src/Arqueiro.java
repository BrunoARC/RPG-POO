public class Arqueiro extends Arquetipos implements LongoAlcance {
    private int quantidadeFlechas;
    private int precisao;

    public Arqueiro(String nome, int nivel) {
        super(nome, nivel, "Arqueiro");
    }

    public int getQuantidadeFlechas() {
        return quantidadeFlechas;
    }

    public void setQuantidadeFlechas(int quantidadeFlechas) {
        this.quantidadeFlechas = quantidadeFlechas;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public void disparoMultiplo() {
        System.out.println(getNome() + " dispara várias flechas de uma só vez!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " mira com precisão e prepara um tiro certeiro!");
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " atira uma flecha em " + alvo.getNome() + " à distância!");
    }

    @Override
    public void defender(int dano) {
        System.out.println(getNome() + " recua e reduz " + dano + " de dano mantendo distância.");
    }
}
