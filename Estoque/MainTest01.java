package estoque;

import java.util.Scanner;

public class MainTest01 {
    public static void main(String[] args) {
        GerenciadorDeEstoque gerenciadorDeEstoque = new GerenciadorDeEstoque();
        
        Scanner scanner = new Scanner(System.in);
        int op;

        while (true) {
            System.out.println("1- Adiconar");
            System.out.println("2- Remover");
            System.out.println("3- Consultar");
            System.out.println("4- Listar");
            System.out.println("0- Sair");
            System.out.println("Opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            if(op == 0 ){
                break;
            }
            if (op == 1) {
                System.out.print("Produto: " );
                String produto = scanner.nextLine();
                
                System.out.print("Quantidade: " );
                Integer quantidade = scanner.nextInt();

                System.out.println(gerenciadorDeEstoque.adicionarOuAtualizar(produto, quantidade));
            }

            if (op == 2){
                System.out.println("Produto: ");
                String produto = scanner.nextLine();

                System.out.println(gerenciadorDeEstoque.removerProduto(produto));
            }

            if(op == 3){
                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                gerenciadorDeEstoque.consultarProduto(produto);
            }
            
            if(op == 4){
                gerenciadorDeEstoque.exibirTodosProdutos();
            }


        }
        scanner.close();
    }
}
