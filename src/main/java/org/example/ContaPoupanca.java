package org.example;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 100;
    public ContaPoupanca() {
            super.agencia = Conta.AGENCIA_PADRAO;
            super.numConta = SEQUENCIAL++;
        }
}
