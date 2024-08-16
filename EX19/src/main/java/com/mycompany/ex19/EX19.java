/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex19;
import java.util.Scanner;

/**
 *
 *  Cálculo de Potência: Crie um programa que solicite ao usuário a base e o expoente, e 
 * utilize um laço FOR para calcular a potência (base^expoente). O programa deve exibir o 
 * resultado ao final.
 */
public class EX19 {

    public static void main(String[] args) {
        int expoente, base , resultado= 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|              Calculo de Potencia                  |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|  Entre com o valor da base: ");
        base = ler.nextInt();
        System.out.println("|  Entre com o valor do exploente: ");
        expoente = ler.nextInt();
        
        resultado=base;
        
        for (int i = 1 ; i<expoente; i++){
            resultado *= resultado;
        }
        System.out.println("|  Potencia de base:" + base + ", expoente: " + expoente + " = " + resultado);
        System.out.println("|  ");
        System.out.println("|  Saindo... ");
    }
}
