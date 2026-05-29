public class Mago extends Arquetipos implements LongoAlcance {
    private String elementoMagico;
    private int poderMagico;

    public Mago(String nome, int nivel) {
        super(nome, nivel, "Mago");
    }

    public String getElementoMagico() {
        return elementoMagico;
    }

    public void setElementoMagico(String elementoMagico) {
        this.elementoMagico = elementoMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public void lancarMagia() {
        System.out.println(getNome() + " lança uma magia do elemento " + this.elementoMagico + "!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " canaliza todo o seu poder mágico em um feitiço devastador!");
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " conjura um feitiço contra " + alvo.getNome() + " à distância!");
    }

    @Override
    public void defender(int dano) {
        System.out.println(getNome() + " cria uma barreira mágica e absorve " + dano + " de dano.");
    }
}
