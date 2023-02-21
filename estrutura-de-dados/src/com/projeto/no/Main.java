package com.projeto.no;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Esse eh o no 1");
        No<String> no2 = new No<>("Esse eh o no 2");
        No<String> no3 = new No<>("Esse eh o no 3");
        No<String> no4 = new No<>("Esse eh o no 4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no2.getProximoNo());
        System.out.println(no2.getProximoNo().getProximoNo());
    }
}
