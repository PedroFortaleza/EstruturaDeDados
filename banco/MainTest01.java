package banco;

import java.util.Scanner;

public class MainTest01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Vizualizar saldo");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            Integer opcao = scanner.nextInt();

            if(opcao == 0){
                break;
            }
            if(opcao == 1){
                System.out.println("Valor do deposito: ");
                double valor = scanner.nextDouble();

                contaBancaria.depositar(valor);
            }
            if(opcao == 2){
                System.out.println("Valor do saque: ");
                double valor = scanner.nextDouble();

                contaBancaria.sacar(valor);
            }

            if(opcao == 3){
                contaBancaria.mostrarSaldo();
            }
        }

    }
}
