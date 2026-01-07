package br.com.guipacheco.rh.model;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor extends Funcionario {
    private List<String> tecnologias;

    public Desenvolvedor(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
        this.tecnologias = new ArrayList<>();
    }
    public void adicionarTecnologias(String tecnologia) {
        this.tecnologias.add(tecnologia);
    }

    @Override
    public double calcularSalario() {
        return 3000.00 + (tecnologias.size() * 500.00 );
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo Desenvolvedor | Tecnologias: " + String.join(",", tecnologias));
    }
}
