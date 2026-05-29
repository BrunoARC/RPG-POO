public abstract class Arquetipos extends Personagem {
    private String tipoClasse;
    private String armaPrincipal;

    public Arquetipos(String nome, int nivel, String tipoClasse) {
        super(nome, nivel);
        this.tipoClasse = tipoClasse;
    }

    public String getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(String tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void uparNivel() {
        setNivel(getNivel() + 1);
        System.out.println(getNome() + " subiu para o nível " + getNivel() + "!");
    }
}
