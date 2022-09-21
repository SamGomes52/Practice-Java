package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("*********************************\n" +
                "Exercicios Let's Code Java\n" +
                "*********************************\n" +
                "Selecione a opcao desejada:\n" +
                "1 - Tabuada\n" +
                "2 - Conversor de temperatura\n");

        Scanner entrada = new Scanner(System.in);
        int numero = Integer.parseInt(entrada.nextLine());

        switch (numero) {
            case 1:
                exercicio1.tabuada();
                break;

            case 2:
                exercicio2.conversorTemperaturas();
                break;

            default:
                System.out.println("Nenhuma opção válida selecionada!");
        }

    }
}
