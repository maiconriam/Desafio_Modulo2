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

        //Bem vindo
        System.out.println("Olá, bem vindo!");
        System.out.println("Irei te ajudar a gerenciar uma lista de funcionários.");

        while (escolhaMenu == 1){
            //Menu Principal
            System.out.println("Digite 1: Para adicionar funcionário");
            System.out.println("Digite 2: Para ver a lista de funcionários");
            System.out.println("Digite 3: Para remover funcionário");
            menu = leitor.nextInt();
            leitor.nextLine();

            switch (menu) {
                case 1:
                    //Adicionar um funcionario
                    System.out.println("Por favor, digite o nome do funcionário: ");
                    String nome = leitor.nextLine();
                    System.out.println("Por favor, digite o número do funcionário: ");
                    String telefone = leitor.nextLine();
                    System.out.println("Por favor, digite o CPF do funcionário: ");
                    String cpf = leitor.nextLine();
                    System.out.println("Por favor, digite o email do funcionário: ");
                    String email = leitor.nextLine();

                    if (funcionarios.size() != 0){
                        for (String cpfIgual : funcionarios.keySet()){
                            if (cpfIgual.equals(cpf)){
                                System.out.println("Cpf já cadastrado");
                            } else{
                                funcionarios.put(cpf, "Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
                                System.out.println("Funcionário cadastrado com sucesso.ha");
                            }
                        }
                    }else{
                        funcionarios.put(cpf, "Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
                        System.out.println("Funcionário cadastrado com sucesso.");
                    }

                    break;
                case 2:
                    //Lista de funcionarios adicionados
                    for (String listaDeFuncionarios : funcionarios.keySet()){
                        System.out.println("Informações dos funcionários: " + funcionarios.get(listaDeFuncionarios) + " Cpf: " + listaDeFuncionarios);
                    }
                    break;
                case 3:
                    //Remove funcionario ja cadastrado
                    System.out.println("Por favor, digite o cpf do funcionário que você deseja remover: ");
                    String cpfDeletado = leitor.nextLine();
                    for (String listaCPF : funcionarios.keySet()){
                        if(cpfDeletado.equals(listaCPF)){
                            funcionarios.remove(cpfDeletado);
                            System.out.println("Funcionário deletado com sucesso.");
                            break;
                        }else{
                            System.out.println("Funcionário não cadastrado.");
                        }
                    }
                    break;
                default:
                    //Cliente digitando numero menor que 1 ou maior que 3
                    System.out.println("Número invalido.");
                    break;
            }
            //Criando um mini menu para retorna para o menu principal
            System.out.println();
            System.out.println("Digite 1: Para voltar ao menu principal");
            escolhaMenu = leitor.nextInt();
        }
        System.out.println("Programa finalizado");

    }
}
