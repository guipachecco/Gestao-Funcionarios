package br.com.guipacheco.rh.model;

 public class Gerente extends Funcionario {
     private double bonus;

     public Gerente(String nome, String cpf, double salarioBase, double bonus) {
         super(nome, cpf, salarioBase);
         this.bonus = bonus;
     }

     @Override
     public double calcularSalario() {
         return 5000.00 + bonus;
     }

     @Override
     public void exibirDados() {
         super.exibirDados();
         System.out.println("Cargo: Gerente | Bônus: R$ " + bonus);
     }
 }
