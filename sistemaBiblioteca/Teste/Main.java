package sistemaBiblioteca.Teste;

import sistemaBiblioteca.Aplicacao.Biblioteca;
import sistemaBiblioteca.Aplicacao.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== SISTEMA BIBLIOTECA =====");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Listar livros disponíveis");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    Livro livro = new Livro(titulo, autor, true);
                    biblioteca.adicionarLivro(livro);

                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    biblioteca.listarTodosOsLivros();
                    break;

                case 3:
                    biblioteca.listarLivroDisponiveis();
                    break;

                case 4:
                    System.out.print("Digite o título do livro: ");
                    String tituloEmprestar = scanner.nextLine();

                    Livro livroEmprestar = biblioteca.buscarPorTitulo(tituloEmprestar);

                    if (livroEmprestar != null) {
                        livroEmprestar.emprestar();
                        System.out.println("Livro emprestado!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o título do livro: ");
                    String tituloDevolver = scanner.nextLine();

                    Livro livroDevolver = biblioteca.buscarPorTitulo(tituloDevolver);

                    if (livroDevolver != null) {
                        livroDevolver.devolver();
                        System.out.println("Livro devolvido!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
