/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex07;
import java.util.Scanner;

/**
 *
 * Contagem de Números Pares e Ímpares: Crie um programa que solicite ao usuário um 
 * número e utilize um laço FOR para percorrer todos os números de 1 até o número inserido. 
 * O programa deve contar e exibir a quantidade de números pares e ímpares.
 */
public class EX07 {

    public static void main(String[] args) {
        int imPar = 0  ;
        int counterPar = 0 ;
        int counterImpar = 0 ;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("------------------------");
        System.out.println("|  Par ou Impar        |");
        System.out.println("------------------------");
        System.out.println("|  ");
        System.out.println("| Entre com um numero inteiro : ");
        imPar = ler.nextInt();
        System.out.println("|  ");
        
            System.out.println("------------------------");
            System.out.println("| Impar  |   Par     ");
        for (int i =1 ; i<=imPar ; i++){
            if (i<imPar){
            System.out.println("| "+i+"      |     "+ (i+1));
            counterPar++;
            } else {
                System.out.println("| "+i+"      |     ");
            }
            i++;
            counterImpar++;
        }
        System.out.println("|  ");
        System.out.println("| Total Numeros Impares: " + counterImpar);
        System.out.println("| Total Numeros Pares: " + counterPar);
        System.out.println("|  ");
        System.out.println("| Saindo... ");

    }
}
