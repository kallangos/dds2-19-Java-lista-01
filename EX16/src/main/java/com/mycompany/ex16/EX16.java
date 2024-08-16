/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex16;
import java.util.Scanner;

/**
 *
 *  Verificação de Palíndromo: Desenvolva um programa que solicite ao usuário uma 
 * palavra e utilize um laço FOR para verificar se ela é um palíndromo. Utilize IF para 
 * comparar os caracteres da palavra e determinar o resultado.
 */
public class EX16 {

    public static void main(String[] args) {
        String palindromo = "";
        boolean ePalindromo = true;
        int tamanhoPalavra = 0 ;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|           Verificação de Palíndromo               |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|  Digite uma palavra : ");
        palindromo = ler.nextLine();
        tamanhoPalavra = palindromo.length();
        
        for (int i = 0; i < tamanhoPalavra ; i++) {
            //System.out.println("| Lado (A) " + palindromo.charAt(i) + " Lado (B) " + palindromo.charAt(tamanhoPalavra - 1 - i) + " i = "+ i);
            if (palindromo.charAt(i) != palindromo.charAt(tamanhoPalavra - 1 - i)) {
                ePalindromo = false;
                break;
            }
        }
        if (ePalindromo==true){
            System.out.println("|  É um Palíndromo. ");
        } else {
            System.out.println("|  Não é Palíndromo. ");
        }
        System.out.println("| ");
        System.out.println("|  Saindo...");
        
    }
}
