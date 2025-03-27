package controle;

import dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo inicial do caixa: ");
        double saldoInicial = scanner.nextDouble();

        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);
        int option;

        do {
            System.out.println("1. Sacar");
            System.out.println("2. Exibir Saldo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    caixa.sacar(valorSaque);
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 0);

        scanner.close();
    }
}