public class Item {
    private String nome;
    private double peso;
    private double valor;

    public Item(String nome, double peso, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void usar() {
        System.out.println("O item " + this.nome + " foi usado!");
    }
}
