/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex10;

/**
 *
 *  Contagem Regressiva: Desenvolva um programa que exiba uma contagem regressiva de 
 * 10 até 0, utilizando um laço WHILE. O programa deve exibir cada número em sequência até 
 * alcançar o zero.
 */
public class EX10 {

    public static void main(String[] args) {
        int counter = 10;
        
        System.out.println("--------------------------------");
        System.out.println("|      Contagem Regressiva     |");
        System.out.println("--------------------------------");
        System.out.println("| Iniciando em 10 ");
        System.out.println("| ");

        while (counter>=0){
            System.out.println("| "+ counter--);
        }

        System.out.println("| ");
        System.out.println("| Saindo...");        
    }
}
