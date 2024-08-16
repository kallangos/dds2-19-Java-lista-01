/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex08;
import java.util.Scanner;

/**
 *
 * Sistema de Senha: Desenvolva um programa que solicite ao usuário uma senha e utilize 
 * IF-ELSE para verificar se ela atende aos critérios de segurança (mínimo de 8 caracteres). O 
 * programa deve permitir ao usuário tentar novamente até que uma senha válida seja 
 * inserida.
 */
public class EX08 {

    public static void main(String[] args) {
        String pwd = "pwd";
        Scanner ler = new Scanner(System.in);
        
        while (pwd.length()<=8){
            System.out.println("------------------------");
            System.out.println("|  Senha Validator     |");
            System.out.println("------------------------");
            System.out.println("|  ");
            System.out.println("| Entre com uma senha de no MINIMO 08 caracteres : ");
            pwd = ler.nextLine();
            if (pwd.length()<8){
                System.out.println("|  ");
                System.out.println("| Senha INVALIDA com apenas "+ pwd.length()+ " caracteres.");
            } else {
                System.out.println("|  ");
                System.out.println("| Senha valida com "+ pwd.length()+ " caracteres.");
                System.out.println("| Saindo...");
                System.out.println("|  ");
            }
        }
    }
}
