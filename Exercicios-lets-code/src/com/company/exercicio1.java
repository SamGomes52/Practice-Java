package com.company;

import java.util.Scanner;

// Escreva um programa que informa a tabuada de multiplicação de um número informado pelo
// usuário (entre 1-10).

public class exercicio1 {
    public static void tabuada(){
        System.out.println("Entre com um numero de 1 a 10:");

        Scanner entrada = new Scanner(System.in);
        int numero = Integer.parseInt(entrada.nextLine());

        if (numero < 1 || numero > 10) {
            throw new ArithmeticException("O numero inserido deve estar entre 1 e 10");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = " + numero*i);
        }
    }
}
