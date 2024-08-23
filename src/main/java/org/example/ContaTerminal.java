package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 00;
        String agencia = "nulll";
        String nomeCliente;
        double saldo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor digite o número da conta: ");
        while ( contarDigitos(numero) != 4){
            numero = teclado.nextInt();
            if ( contarDigitos(numero) != 4){
                System.out.println("Por favor digite um número de 4 digitos: ");
            }else{
                break;
            }

        }
        System.out.println("Por favor digite o número da agência: ");
        while ( agencia.length() != 4 ){
            agencia = teclado.next();
            if (agencia.length() != 4){
                System.out.println("Por favor digite um número de 3 digitos: ");
            }else{
                agencia =  addHyphen(agencia);
                break;
            }

        }

        System.out.println("Por favor digite o nome do cliente: ");
        nomeCliente = teclado.next();
        String nomeformat = nomeCliente.toUpperCase();
        nomeCliente = nomeformat;


        System.out.println("Digite o saldo inicial: ");
        saldo = teclado.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu Saldo$:%.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

    }

    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10; // Equivalente a numero = numero / 10
            contador++;
        }
        return contador;
    }

    private static String addHyphen(String input) {
        // Verifica se o tamanho da entrada é maior que 2
        if (input.length() > 3) {
            // Adiciona o hífen após o segundo dígito
            return input.substring(0, 3) + "-" + input.substring(3);
        }
        return input;
    }
}