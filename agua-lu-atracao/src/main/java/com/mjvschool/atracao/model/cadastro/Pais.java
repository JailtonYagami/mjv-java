package com.mjvschool.atracao.model.cadastro;

public enum Pais {
    BRASIL ("BR","Brasil"),
    PERU ("PE","Peru"),
    ESTADOS_UNIDOS ("US","Estados Unidos");

    private String sigla;
    private String nome;

    private Pais(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
}
