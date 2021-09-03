package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();

        int menu = 0;
        int escolhaMenu = 1;


        System.out.println("Olá, bem vindo!");
        System.out.println("Irei te ajudar a gerenciar uma lista de funcionários.");

        while (escolhaMenu == 1){
            System.out.println("Digite 1: Para adicionar funcionário");
            System.out.println("Digite 2: Para remover funcionário");
            menu = leitor.nextInt();
            leitor.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Por favor, digite o nome do funcionário: ");
                    String nome = leitor.nextLine();
                    System.out.println("Por favor, digite o número do funcionário: ");
                    String telefone = leitor.nextLine();
                    System.out.println("Por favor, digite o CPF do funcionário: ");
                    String cpf = leitor.nextLine();
                    System.out.println("Por favor, digite o email do funcionário: ");
                    String email = leitor.nextLine();

                    funcionarios.put(cpf, "Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
                    System.out.println(funcionarios);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Número invalido.");
                    break;
            }
            System.out.println("Digite 1: Para voltar ao menu principal");
            escolhaMenu = leitor.nextInt();
        }
        System.out.println("Programa finalizado");

    }
}
