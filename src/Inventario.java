public class Inventario {
    private int capacidadeMaxima;
    private Item[] itens;
    private int quantidadeItens;

    public Inventario(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.itens = new Item[capacidadeMaxima];
        this.quantidadeItens = 0;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        if (quantidadeItens < capacidadeMaxima) {
            itens[quantidadeItens] = item;
            quantidadeItens++;
            System.out.println("O item " + item.getNome() + " foi adicionado ao inventário.");
        } else {
            System.out.println("O inventário está cheio!");
        }
    }

    public void removerItem(Item item) {
        for (int i = 0; i < quantidadeItens; i++) {
            if (itens[i] == item) {
                for (int j = i; j < quantidadeItens - 1; j++) {
                    itens[j] = itens[j + 1];
                }
                itens[quantidadeItens - 1] = null;
                quantidadeItens--;
                System.out.println("O item " + item.getNome() + " foi removido do inventário.");
                return;
            }
        }
        System.out.println("O item não foi encontrado no inventário.");
    }

    public void listarItens() {
        System.out.println("Itens do inventário:");
        for (int i = 0; i < quantidadeItens; i++) {
            System.out.println("- " + itens[i].getNome());
        }
    }
}
