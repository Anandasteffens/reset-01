package com.company;


public class App {

    public static void main (String[] args){

        Calculadora calculadoraDeIdades = new Calculadora();

        int somaDasIdades = calculadoraDeIdades.somar( 33, 54);
        System.out.println("A soma das idades é: " +somaDasIdades);

        int subtrairIdades = calculadoraDeIdades.subtrair(33, 54);
        System.out.println("A subtração das idades é: " +subtrairIdades);

        int multiplicarIdades = calculadoraDeIdades.multiplica( 33, 54);
        System.out.println("A multiplicação das idades é: " +multiplicarIdades);

        double dividirIdades = calculadoraDeIdades.divide(33, 54);
        System.out.println("A divisao das idades é: " +dividirIdades);

        int restoDivisao = calculadoraDeIdades.modulo(33, 54);
        System.out.println("O resto da divisao é: " +restoDivisao);

        Comparador comparadorDeNumeros = new Comparador();
        boolean menorQue = comparadorDeNumeros.comparar(1, 5);
        System.out.println(menorQue);
    }
}
