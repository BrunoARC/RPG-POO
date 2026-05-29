public abstract class Personagem {
     private String nome;
     private int nivel;
     private int vida;
     private int mana;
     private int forca;
     private int agilidade;
     private Inventario inventario;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.inventario = new Inventario(10);
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void mover(){
        System.out.println("O personagem se move na direção do alvo!");
    }
    public void mostrarStatus(){
        System.out.println("O nivel do personagem é: " + this.nivel);
        System.out.println("A vida do personagem é: " + this.vida);
        System.out.println("A mana do personagem é: " + this.mana);
        System.out.println("A força do personagem é: " + this.forca);
        System.out.println("A agilidade do personagem é: " + this.agilidade);
    }
    public void usarHabilidadeEspecial(){
        System.out.println(this.nome + " usa habilidade de especial");
    }
}
