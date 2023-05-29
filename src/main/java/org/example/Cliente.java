package org.example;

public class Cliente {
    private String nome;

    // com Lombok (@Data)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
