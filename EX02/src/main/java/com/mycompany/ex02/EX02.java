/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * 2. Jogo de Adivinhação: Desenvolva um programa em que o computador escolhe um número
 * aleatório entre 1 e 100, e o usuário tem que adivinhar. Utilize um laço WHILE para permitir
 * múltiplas tentativas até que o usuário acerte, e IF-ELSE para fornecer dicas (se o número é
 * maior ou menor).
 */
public class EX02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random randomico = new Random();
        int nSorteado = randomico.nextInt(100)+1;
        boolean acertou = false; 
        
        System.out.println("O computador sorteou um numero entre 1 e 100");
        System.out.println("Tente adivinhar este numero.");
        System.out.println("[  " + nSorteado+ "  ]");

        while (acertou!=true){

            System.out.println("Qual numero ele sorteou?: ");

            float n1 = ler.nextFloat();
               if (n1!=nSorteado){
                System.out.println("voce errou!");
                    if (nSorteado>n1)   {
                        System.out.println("Dica: o numero sorteado é maior que o numero digitado.");
                    } else {
                        System.out.println("Dica: o numero sorteado é menor que o numero digitado.");
                        }
               }
               if (nSorteado==n1){
                   System.out.println("Parabens vc acertou.");
                   acertou=true;
               }
        }
    }
}
