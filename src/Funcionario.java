package com.maxglobalsports.sistemagestaofuncionarios;

public class Funcionario {
    private String nome;
    private String matricula;
    private String alergias;
    private String problemasMedicos;
    private String telefoneContato;
    private String emailContato;

    public Funcionario(String nome, String matricula, String alergias, String problemasMedicos, String telefoneContato, String emailContato) {
        this.nome = nome;
        this.matricula = matricula;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", alergias='" + alergias + '\'' +
                ", problemasMedicos='" + problemasMedicos + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                ", emailContato='" + emailContato + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}