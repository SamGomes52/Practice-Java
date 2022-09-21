package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercicios Let's Code Java\n" +
                "Selecione a opcao desejada:\n" +
                "1 - Tabuada");

        Scanner entrada = new Scanner(System.in);
        int numero = Integer.parseInt(entrada.nextLine());

        switch (numero) {
            case 1:
                exercicio1.tabuada();
                break;

            default:
                System.out.println("Nenhuma opção válida selecionada!");
        }

    }
}
