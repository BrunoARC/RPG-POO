public class Guilda {
    private String nome;
    private int quantidadeMembros;
    private Personagem[] membros;

    public Guilda(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.quantidadeMembros = 0;
        this.membros = new Personagem[capacidadeMaxima];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeMembros() {
        return quantidadeMembros;
    }

    public void adicionarMembro(Personagem personagem) {
        if (quantidadeMembros < membros.length) {
            membros[quantidadeMembros] = personagem;
            quantidadeMembros++;
            System.out.println(personagem.getNome() + " entrou na guilda " + this.nome + ".");
        } else {
            System.out.println("A guilda " + this.nome + " está cheia!");
        }
    }

    public void removerMembro(Personagem personagem) {
        for (int i = 0; i < quantidadeMembros; i++) {
            if (membros[i] == personagem) {
                for (int j = i; j < quantidadeMembros - 1; j++) {
                    membros[j] = membros[j + 1];
                }
                membros[quantidadeMembros - 1] = null;
                quantidadeMembros--;
                System.out.println(personagem.getNome() + " saiu da guilda " + this.nome + ".");
                return;
            }
        }
        System.out.println("Este personagem não faz parte da guilda " + this.nome + ".");
    }
}
