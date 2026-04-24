package sistemaBiblioteca.Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
   
    private ArrayList<Livro> listaDelivro;

    public Biblioteca(){
        this.listaDelivro = new ArrayList<>();
        
    }

    public void adicionarLivro(Livro livro){
        listaDelivro.add(livro);
    }

    public void listarTodosOsLivros(){
        for(Livro livro : listaDelivro){
            livro.exibirInfo();
            System.out.println("-------------");
        }
    }

    public void listarLivroDisponiveis(){
        for (Livro livro : listaDelivro) {
            if (livro.getDisponivel()) {
                livro.exibirInfo();
                System.out.println("-------------------");
            }
        }
    }

    public Livro buscarPorTitulo(String titulo){
        for (Livro livro : listaDelivro) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
           
        }
         return null;
    }
    
    public ArrayList<Livro> getListaDelivro() {
        return listaDelivro;
    }
    public void setListaDelivro(ArrayList<Livro> listaDelivro) {
        this.listaDelivro = listaDelivro;
    }
}
