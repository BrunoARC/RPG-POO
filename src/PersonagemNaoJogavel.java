public class PersonagemNaoJogavel extends Personagem {
    private String funcao;
    private String dialogo;

    public PersonagemNaoJogavel(String nome, int nivel) {
        super(nome, nivel);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDialogo() {
        return dialogo;
    }

    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }

    public void interagir() {
        System.out.println(getNome() + " diz: " + this.dialogo);
    }

    public void mostrarMissao() {
        System.out.println(getNome() + " oferece uma missão para o jogador.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usa uma habilidade especial de NPC.");
    }
}
