/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex12;
import java.util.Scanner;

/**
 *
 *  Sistema de Votação: Desenvolva um programa que permita ao usuário votar em 3 
 * candidatos diferentes. O programa deve utilizar um laço FOR para permitir a votação de 
 * vários eleitores e, ao final, exibir o total de votos de cada candidato e o vencedor.
 */
public class EX12 {

    public static void main(String[] args) {
        int voto = 0 ;
        int nineFingers = 0 ;
        int BozoRaiz = 0 ;
        int Trumphet = 0 ;
        Scanner ler = new Scanner(System.in);
        
        for (int i = 1 ; i<=9 ; i++){
            System.out.println("-----------------------------------------------------");
            System.out.println("|  Sistema de Votação FAZUELE     Eleitor n: ( "+ i +" )");
            System.out.println("-----------------------------------------------------");
            System.out.println("|                                                   |");
            System.out.println("|  Escolha seu Canditado:                           |");
            System.out.println("|                                                   |");
            System.out.println("|  (1) 9Fingers   (2)BozoRaiz   (3)Trumphet         |");
            System.out.println("|  ");
            voto = ler.nextInt();
            if (voto==3){
                Trumphet++;
            } else if (voto==2){
                BozoRaiz++;
            } else if (voto==1){
                nineFingers++;
            } else if ((voto!=1)&(voto!=2)&(voto!=3)){
                System.out.println("|  * VOTO ANULADO * ");
            } 
            System.out.println("|  ");
            System.out.println("|  ");
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("|           Apuração FAZUELE by Moraes             |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|  Candidato 9Fingers : "+ nineFingers + " votos.                    |");
        System.out.println("|                                                   |");
        System.out.println("|  Candidato BozoRaiz : "+ BozoRaiz + " votos.                    |");
        System.out.println("|                                                   |");
        System.out.println("|  Candidato Trumphet : "+ Trumphet + " votos.                    |");
        System.out.println("|                                                   |"); 
        System.out.println("-----------------------------------------------------");
        
        if ((nineFingers>BozoRaiz) & (nineFingers>Trumphet)){
            System.out.println("|  Vencedor  9Fingers                                |");
        } else if ((BozoRaiz>nineFingers) & (BozoRaiz>Trumphet)){
            System.out.println("|  Vencedor  BozoRaiz                                |");
        } else if ((Trumphet>BozoRaiz) & (Trumphet>nineFingers)){
            System.out.println("|  Vencedor  Trumphet                               |");
        }
        
        if ((nineFingers==BozoRaiz)|(nineFingers==Trumphet)|(BozoRaiz==Trumphet)){
            System.out.println("|  EMPATE - Haverá segundo turno                   |");
        }

    ler.close();
    }
}
