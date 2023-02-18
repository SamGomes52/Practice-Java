package com.projetono;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Esse eh o no 1");
        No no2 = new No("Esse eh o no 2");
        No no3 = new No("Esse eh o no 3");
        No no4 = new No("Esse eh o no 4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no2.getProximoNo());
        System.out.println(no2.getProximoNo().getProximoNo());
    }
}
