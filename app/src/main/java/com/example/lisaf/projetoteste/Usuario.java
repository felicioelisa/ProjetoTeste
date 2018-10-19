package com.example.lisaf.projetoteste;

public class Usuario {

    private int codigo;
    private String nome;
    private long CPF;
    private String pass;

    public Usuario() {
    }

    public Usuario(int codigo, String nome, long CPF, String pass){
        this.codigo=codigo;
        this.CPF=CPF;
        this.nome=nome;
        this.pass=pass;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", CPF=" + CPF +
                ", pass='" + pass + '\'' +
                '}';
    }
}
