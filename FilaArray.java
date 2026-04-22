public class FilaArray {
    private int[] dados;
    private int inicio; // frente da fila
    private int fim;    // final da fila
    private int tamanho;

    public FilaArray(int capacidade) {
        dados = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    // adicionar no final da fila
    public void offer(int valor) {
        if (tamanho == dados.length) {
            throw new RuntimeException("Overflow");
        }

        fim++;
        dados[fim] = valor;
        tamanho++;
    }

    // remover da frente da fila
    public int poll() {
        if (tamanho == 0) {
            throw new RuntimeException("Underflow");
        }

        int valor = dados[inicio];
        inicio++;
        tamanho--;

        return valor;
    }

    // visualizar o primeiro elemento
    public int peek() {
        if (tamanho == 0) {
            throw new RuntimeException("Fila vazia");
        }

        return dados[inicio];
    }
}