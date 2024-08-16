/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex15;
import java.util.Scanner;

/**
 *
 *  Cálculo de Fatorial: Crie um programa que solicite ao usuário um número e utilize um 
 * laço FOR para calcular o fatorial desse número. O programa deve exibir o resultado ao final.
 */
public class EX15 {

    public static void main(String[] args) {
        int numSelecionado = 0 ;
        long numFatorial = 1 ;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|          Calculo Fatorial                         |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|  Digite o numero inteiro para fatorar: ");
        numSelecionado = ler.nextInt();

        for (int i = 1; i <= numSelecionado; i++) {
            numFatorial *= i;
        }
 
        System.out.println("|                                                   |");
        System.out.println("|  O Fatorial do numero "+ numSelecionado +" é : " + numFatorial);
        System.out.println("|                                                   |");
        System.out.println("|  Saindo...                                        |");


    }
}
