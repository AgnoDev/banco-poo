package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Agno");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Lara");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.imprimirExtrato();
        cc.depositar(50);
        cc.sacar(20);
        cc.transferir(30, cp);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        cp.imprimirExtrato();
        }
}
