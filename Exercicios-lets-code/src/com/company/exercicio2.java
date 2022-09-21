package com.company;

import java.util.Scanner;

// Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
// 9/5) + 32 = 32 °F.

public class exercicio2 {
    public static void conversorTemperaturas() {
        System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");

        Scanner entrada = new Scanner(System.in);
        double temperaturaCelsius = Double.parseDouble(entrada.nextLine());

        double temperaturaFahrenheit;

        temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.printf("O equivalente a %.2f C eh %.2f F", temperaturaCelsius, temperaturaFahrenheit);
    }
}
