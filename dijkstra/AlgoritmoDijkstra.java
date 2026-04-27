package dijkstra;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlgoritmoDijkstra {
    private int vertices[][];

    public AlgoritmoDijkstra(final int numVertices){
        vertices = new int[numVertices][numVertices];
    }

    public void criarAresta(final int noOrigem, final int noDestino, final int peso) throws InvalidAlgorithmParameterException{
        if(peso >= 1){
            vertices[noOrigem][noDestino] = peso; 
            vertices[noDestino][noOrigem] = peso; 
        }else {
            throw new InvalidAlgorithmParameterException("O peso do nó origem ["+noOrigem+"] para nó destino ["+noDestino+"] não pode ser negativo!");
        }
    }

    public int getMaisProximo(final int listaCusto[], final Set<Integer> naoVisitados){
        int minDistancia = Integer.MAX_VALUE;
        int noProximo = -1;
        for(Integer i : naoVisitados){
            if(listaCusto[i] < minDistancia){
                minDistancia = listaCusto[i];
                noProximo = i;
            }
        }
        return noProximo;
    }

    public List<Integer> getVizinhos(final int no){
        List<Integer> vizinhos = new ArrayList<Integer>();
        for(int i = 0; i < vertices.length; i++){
            if(vertices[no][i] > 0){
                vizinhos.add(i);
            }
        }
        return vizinhos;
    }
    
    public int getCusto(final int noOrigem, final int noDestino){
        return vertices[noOrigem][noDestino];
    }

    public List<Integer> caminhoMinimo(final int noOrigem, final int noDestino){
        int custo[] = new int[vertices.length];
        int antecessor[] = new int[vertices.length];
        Set<Integer> naoVisitados = new HashSet<Integer>();

        custo[noOrigem] = 0;

        for(int v = 0; v < vertices.length; v++){
            if(v != noOrigem){
                custo[v] = Integer.MAX_VALUE;
            }
            antecessor[v] = -1;
            naoVisitados.add(v);
        }

        int noMaisProximo = -1;

        while(!naoVisitados.isEmpty()){
            noMaisProximo = getMaisProximo(custo, naoVisitados);
            if(noMaisProximo == -1){
                break;
            }
            naoVisitados.remove(noMaisProximo);

            for(Integer vizinhos : getVizinhos(noMaisProximo)){
                int custoTotal = custo[noMaisProximo] + getCusto(noMaisProximo, vizinhos);
                if(custoTotal < custo[vizinhos]){
                    custo[vizinhos] = custoTotal;
                    antecessor[vizinhos] = noMaisProximo;
                }
            }
        }

        return caminhoMaisProximo(antecessor, noDestino);
    }

    public List<Integer> caminhoMaisProximo(int antecessor[], int noMaisProximo){
        List<Integer> caminho = new ArrayList<>();
        caminho.add(noMaisProximo);

        while(antecessor[noMaisProximo] != -1 ){
            caminho.add(antecessor[noMaisProximo]);
            noMaisProximo = antecessor[noMaisProximo];
        }
        Collections.reverse(caminho);
        return caminho;
    }
}