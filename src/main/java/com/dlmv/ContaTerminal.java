package com.dlmv;

import javax.swing.*;

public class ContaTerminal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        JOptionPane.showMessageDialog(null,"""
                Olá! Seja bem vindo.
                Vamos lhe auxiliar em seu cadastro.
                """);

        cliente.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Por favor, comece inserindo o número de sua conta:"
        )));

        cliente.setAgencia(JOptionPane.showInputDialog(null,
                "Agora, insira o número de sua agência bancária:"
        ));

        cliente.setNomeCliente(JOptionPane.showInputDialog(null,
                "Por favor, digite o seu nome:"
        ));

        cliente.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual será o valor de seu depósito inicial?"
        )));

        JOptionPane.showMessageDialog(null,
                "Olá " + cliente.getNomeCliente()
                        + " , obrigado por criar uma conta em nosso banco. Sua agência é "
                        + cliente.getAgencia() + ", conta: " + cliente.getNumero()
                        + " e seu Saldo de R$: " + cliente.getSaldo()
                        + " já esta disponível para saque.");

        System.exit(0);

    }
}