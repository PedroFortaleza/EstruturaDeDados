package dijkstra;

import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.Scanner;

public class TestDijkstra {
    private static final int S1 = 0;
    private static final int S2 = 1;
    private static final int S3 = 2;
    private static final int S4 = 3;
    private static final int S5 = 4;
    private static final int S6 = 5;
    private static final int S7 = 6;
    private static final int S8 = 7;
    private static final int S9 = 8;
    private static final int S10 = 9;
    private static final int S11 = 10;
    private static final int S12 = 11;
    private static final int S13 = 12;
    private static final int S14 = 13;
    private static final int S15 = 14;
    private static final int S16 = 15;
    private static final int S17 = 16;
    private static final int S18 = 17;
    private static final int S19 = 18;
    private static final int S20 = 19;

    public static void main(String[] args) {
        AlgoritmoDijkstra dijkstra = new AlgoritmoDijkstra(20);
        Scanner scanner = new Scanner(System.in);

        try {
            dijkstra.criarAresta(S1, S2, 4);
            dijkstra.criarAresta(S1, S3, 2);
            dijkstra.criarAresta(S2, S3, 5);
            dijkstra.criarAresta(S2, S4, 10);
            dijkstra.criarAresta(S3, S5, 3);
            dijkstra.criarAresta(S5, S4, 4);
            dijkstra.criarAresta(S4, S6, 11);

            while(true){
                System.out.println("\nDigite o nó de origem (1 a 20) ou 0 para sair:");
                int origem = scanner.nextInt();

                if(origem == 0){
                    break;
                }

                System.out.println("Digite o nó de destino (1 a 20):");
                int destino = scanner.nextInt();

                origem = origem - 1;
                destino = destino - 1;

                List<Integer> caminho = dijkstra.caminhoMinimo(origem, destino);

                System.out.println("Caminho mínimo:");
                for(Integer no : caminho){
                    System.out.print("S" + (no + 1) + " ");
                }
                System.out.println();
            }

        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}