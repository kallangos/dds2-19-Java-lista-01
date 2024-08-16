/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex13;
import java.util.Scanner;

/**
 *
 *  Verificação de Ano Bissexto: Crie um programa que solicite ao usuário um ano e utilize 
 * IF-ELSE para verificar se ele é bissexto. O programa deve seguir as regras de divisibilidade 
 * para determinar o resultado.
 * 
 * Site com referencia para o calculo.
 * https://ihgms.org.br/vc-sabia/como-se-calcula-se-um-ano-e-bissexto-227#:~:text=Para%20se%20saber%20se%20qualquer,foi%20bissexto%3B%20b)%201998.
 */
public class EX13 {

    public static void main(String[] args) {
        String ano = "" ;
        int decada = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|   Verificador de ano Bissexto                     |");
        System.out.println("-----------------------------------------------------");
        System.out.println("| ");
        System.out.println("| Digite o ano que deseja verificar: ");
        ano = ler.nextLine();
        decada = Integer.parseInt(ano.substring(ano.length() - 2));

        if ((decada%4) == 0){
            System.out.println("| O Ano de "+ ano + " é Bissexto ");
        } else {
            System.out.println("| O Ano de "+ ano + " não é Bissexto ");
        }
    
        System.out.println("| Saindo...");
        ler.close();
    }
}
