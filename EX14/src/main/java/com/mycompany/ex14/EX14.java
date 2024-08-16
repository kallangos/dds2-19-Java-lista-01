/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex14;
import java.util.Scanner;
import java.util.Random;

/**
 *
 *  Jogo do Par ou Ímpar: Desenvolva um jogo em que o usuário escolhe um número e o 
 * programa sorteia outro número aleatório. Utilize IF-ELSE para determinar se a soma dos 
 * dois números é par ou ímpar, e declare o vencedor com base na escolha do usuário.
 */
public class EX14 {

    public static void main(String[] args) {
        int numSorteado = 0 ;
        int numJogador = 0 ;
        int parImpar = 0 ;
        Scanner ler = new Scanner(System.in);
        Random randomico = new Random();
        
        numSorteado = randomico.nextInt(20)+1;
        System.out.println("***********" + numSorteado);
        
            System.out.println("-----------------------------------------------------");
            System.out.println("|          Par ou Impar - The Game                  |");
            System.out.println("-----------------------------------------------------");
            System.out.println("|                                                   |");
            System.out.println("|  Digite o numero inteiro que dejeja jogar: ");
            numJogador = ler.nextInt();
            System.out.println("|  Informe suas aposta :                            |");
            System.out.println("|                                                   |");
            System.out.println("|  (1) Par  ou   (2) Impar                          |");
            parImpar = ler.nextInt();
        
                System.out.println("|  Voce escolheu o numero : " + numJogador );
                System.out.println("|  A Maquina escolheu o numero : " + numSorteado );
                System.out.println("|  O resultado foi : " + (numSorteado+numJogador));

            if (((numJogador+numSorteado)%2==0) & (parImpar==1)) {
                System.out.println("|  Você VENCEU!!! " + (numSorteado+numJogador) + " é PAR");
            } else if (((numJogador+numSorteado)%2==0) & (parImpar==2)) {
                System.out.println("|  Você PERDEU!!! " + (numSorteado+numJogador) + " é PAR");
            } else if (((numJogador+numSorteado)%2!=0) & (parImpar==1)) {
                System.out.println("|  Você PERDEU!!! " + (numSorteado+numJogador) + " é IMPAR");
            } else if (((numJogador+numSorteado)%2!=0) & (parImpar==2)) {
                System.out.println("|  Você VENCEU!!! " + (numSorteado+numJogador) + " é IMPAR");
            }
            
        System.out.println("| ");
        System.out.println("| Saindo...");
        System.out.println("| ");
        ler.close();
    }
}
