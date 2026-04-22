package arvore;

public class Arvore {
    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() {
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore(Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty() {
        return this.folha == null;
    }

    public void inserir(Folha novo) {
        if (isEmpty()) {
            this.folha = novo;
        } else {
            if (novo.getValor() < this.folha.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = new Arvore(novo);
                    System.out.println("Folha: " + novo.getValor() + 
                        " a esquerda de: " + this.folha.getValor());
                } else {
                    this.esquerda.inserir(novo);
                }

            } else if (novo.getValor() > this.folha.getValor()) {
                if (this.direita == null) {
                    this.direita = new Arvore(novo);
                    System.out.println("Folha: " + novo.getValor() + 
                        " a direita de: " + this.folha.getValor());
                } else {
                    this.direita.inserir(novo);
                }
            }
        }
    }
}