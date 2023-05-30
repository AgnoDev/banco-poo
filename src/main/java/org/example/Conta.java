package org.example;

import lombok.Data;

@Data
public abstract class Conta implements IConta {
    protected int agencia;
    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("O valor sacado foi: " + valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O valor depositado foi: " + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("O valor transferido foi: " + valor);

    }

    protected void consultarSaldo() {
        System.out.println(String.format("Titular.: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia.: %d", this.agencia));
        System.out.println(String.format("Conta.: %d", this.numConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
