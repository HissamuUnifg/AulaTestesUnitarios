package models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private double salario;

    public Funcionario(String nome, LocalDate dataAdmissao, double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

}
