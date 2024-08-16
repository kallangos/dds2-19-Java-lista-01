/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex09;
import java.util.Scanner;

/**
 *
 * Verificação de Números Primos: Crie um programa que solicite ao usuário um número e 
 * utilize um laço FOR para verificar se o número é primo. Utilize IF para determinar se ele é 
 * divisível por outros números além de 1 e ele mesmo.
 */
public class EX09 {

    public static void main(String[] args) {
        int numInt = 0;
        boolean ePrimo= true ;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("--------------------------------");
        System.out.println("|      Primo Calculator        |");
        System.out.println("--------------------------------");
        System.out.println("| ");
        System.out.println("| Entre com um numero inteiro : ");
        numInt = ler.nextInt();
        if (numInt<=1){
            ePrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numInt); i++) {
                if (numInt % i == 0) {
                    ePrimo = false;
                    break; // Se encontrar um divisor, não é primo
                }
            }
        }
        
        if (ePrimo) {
            System.out.println("| ");
            System.out.println("| Seu numero : " + numInt + " É primo.");
        } else {
            System.out.println("| ");
            System.out.println("| Seu numero : " + numInt + " NÃO é primo.");
        }
        
        System.out.println("| ");
        System.out.println("| Saindo...");

        ler.close();        
        
    }
}
