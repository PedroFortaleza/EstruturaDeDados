package GerenciarNomes;

import java.util.HashSet;
import java.util.Scanner;

public class GerenciadorDeNomes {
    private HashSet<String> hashNomes;

    public GerenciadorDeNomes(){
        this.hashNomes = new HashSet<String>();
    }

    public String adicionarNome(final String nome){
        if(hashNomes.add(nome)){
            return "Nome adicionado na lista";
        }
        else {
            return "Nome duplicado";
        }
    }

    public boolean existeNome(final String nome){
        return hashNomes.contains(nome);
    }

    public String removerNome(final String nome){
        if(hashNomes.remove(nome)){
            return "Nome removido!";
        }
        else{
            return "Nome não encontrado";
        }

    }

    public void exibirTodosNomes(){
        if(hashNomes.isEmpty()){
            System.out.println("Lista de nomes vazia");
        }else{
            for(String s : hashNomes){
                System.out.println("Nome: " + s);
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorDeNomes gerenciadorDeNomes = new GerenciadorDeNomes();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("1- adicionar nomes");
            System.out.println("2- verificar nomes");
            System.out.println("3- remover nomes");
            System.out.println("4- exibir todos os nomes");
            System.out.println("5- sair");
            int op = scanner.nextInt();
            scanner.nextLine();

            if(op == 1){
                System.out.println("Digite o nome: ");
                String nome = scanner.nextLine();
                
                System.out.println(gerenciadorDeNomes.adicionarNome(nome));

            }
            if(op == 2){
                System.out.println("Digite o nome que deseja verificar: ");
                String nome = scanner.nextLine();
                System.out.println(gerenciadorDeNomes.existeNome(nome)); 

            }
            if(op == 3){
                System.out.println("Digite o nome que deseja remover: ");
                String nome = scanner.nextLine();
                System.out.println( gerenciadorDeNomes.removerNome(nome));
                

            }
            if(op == 4){
                gerenciadorDeNomes.exibirTodosNomes();
               
            }
            if(op == 5){
                break;
            }
        }
        scanner.close();
    }
}
