package sistemaBiblioteca.Aplicacao;

import java.util.ArrayList;

public class Usuario {
    private String nome; 
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome){
        this.nome = nome; 
        this.livrosEmprestados = new ArrayList<>();
    }

    public void pegarLivro(Livro livro){
        if (livro.getDisponivel()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Livro não disponível");
        }
    }

    public void devolverLivro(Livro livro){
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        }
    }

    public void listarLivrosEmprestados(){
        for (Livro livro : livrosEmprestados) {
            livro.exibirInfo();
        }
    }
}
