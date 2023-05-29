package org.example;

public abstract class Conta implements IConta {
    protected static int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numConta;
    protected double saldo;

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }


    // com Lombok (@Data)
    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }


}
