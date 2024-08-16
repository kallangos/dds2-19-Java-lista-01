/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex17;
import java.util.Scanner;

/**
 *
 *  Contagem de Vogais: Crie um programa que solicite ao usuário uma frase e utilize um 
 * laço FOR para contar o número de vogais presentes. Utilize IF para verificar cada caractere e 
 * determinar se é uma vogal.
 */
public class EX17 {

    public static void main(String[] args) {
        String fraseUser = "";
        int tamanhoFrase = 0;
        int numVogais = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|              Contando as Vogais                   |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|  Digite uma farse ou palavra : ");

        fraseUser = ler.nextLine();
        tamanhoFrase = fraseUser.length();
        
        for (int i = 0; i < tamanhoFrase ; i++) {
             if (fraseUser.charAt(i) == 'a' || fraseUser.charAt(i) == 'e' || fraseUser.charAt(i) == 'i' || 
            fraseUser.charAt(i) == 'o' || fraseUser.charAt(i) == 'u'){
                 numVogais++;
             }
        }
        System.out.println("|  ");
        System.out.println("|  Nesta palavra ou frase há " + numVogais + " vogais. ");
        System.out.println("|  ");
        System.out.println("|  Saindo... ");
    }
}
