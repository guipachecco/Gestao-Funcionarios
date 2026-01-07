package br.com.guipacheco.rh.main;

import br.com.guipacheco.rh.model.Gerente;
import br.com.guipacheco.rh.model.Funcionario;
import br.com.guipacheco.rh.model.Desenvolvedor;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRH {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        int opcao =0;

        while (opcao != 4) {
            System.out.println("\n--- SISTEMA DE GESTÃO DE RH ---");
            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Desenvolvedor");
            System.out.println("3. Listar Todos os Colaboradores");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n[Cadastro de Gerente]");
                    System.out.print("Nome: ");
                    String nomeG = leitor.nextLine();
                    System.out.print("CPF: ");
                    String cpfG = leitor.nextLine();
                    System.out.print("Bônus Salarial: ");
                    double bonus = leitor.nextDouble();

                    listaFuncionarios.add(new Gerente(nomeG, cpfG, 0, bonus));
                    System.out.println("Gerente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n[Cadastro de Desenvolvedor]");
                    System.out.print("Nome: ");
                    String nomeD = leitor.nextLine();
                    System.out.print("CPF: ");
                    String cpfD = leitor.nextLine();

                    Desenvolvedor dev = new Desenvolvedor(nomeD, cpfD, 0);

                    System.out.println("Digite as tecnologias (ou 'fim' para encerrar):");
                    while (true) {
                        System.out.print("Tecnologia: ");
                        String tec = leitor.nextLine();
                        if (tec.equalsIgnoreCase("fim")) break;
                        dev.adicionarTecnologias(tec);
                    }

                    listaFuncionarios.add(dev);
                    System.out.println("Desenvolvedor adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- LISTA GERAL DE FUNCIONÁRIOS ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            f.exibirDados();
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
        }


        }








        leitor.close();
    }
}
