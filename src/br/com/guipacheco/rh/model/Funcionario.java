package br.com.guipacheco.rh.model;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.printf("Nome: %s | CPF: %s | Salário Final: R$ %.2f%n",
                nome, cpf, calcularSalario());
    }

    public String getNome() { return nome; }
}
