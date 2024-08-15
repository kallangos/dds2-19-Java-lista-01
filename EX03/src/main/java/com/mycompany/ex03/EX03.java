/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex03;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * 3. Calculadora Simples: Crie uma calculadora que permita ao usuário escolher entre as
 * operações básicas (adição, subtração, multiplicação e divisão). Utilize IF-ELSE para
 * determinar a operação escolhida e execute-a com base nos números inseridos pelo usuário.
 */
public class EX03 {

    public static void main(String[] args) {
        float resultado= 0;
        float n1,n2 = 0;
        int op = 6;
        Scanner ler = new Scanner(System.in);
        
        while (op!=0){

            System.out.println("------------------------");
            System.out.println("|  Calculadora Basica  ");
            System.out.println("------------------------");
            System.out.println("| Escolha uma operação ");
            System.out.println("| Digite:               ");
            System.out.println("| (1) para Adição    ");
            System.out.println("| (2) para Subtração ");
            System.out.println("| (3) para Divisão   ");
            System.out.println("| (4) para Multiplicar");
            System.out.println("| (0) para SAIR       ");
            System.out.println("| Aguardando : ");
            op = ler.nextInt();

            switch (op) {
                case 4:
                    System.out.println("| Multiplicar          |");
                    System.out.println("| Digite o 1º Numero : ");
                    n1 = ler.nextFloat();
                    System.out.println("| Digite o 2º Numero : ");
                    n2 = ler.nextFloat();
                    resultado= n1*n2;
                    System.out.println("| "+ n1 + " x " + n2 + " = " + resultado);
                    break;
                case 3:
                    System.out.println("| Divisão              |");
                    System.out.println("| Digite o 1º Numero : ");
                    n1 = ler.nextFloat();
                    System.out.println("| Digite o 2º Numero : ");
                    n2 = ler.nextFloat();
                    resultado= n1/n2;
                    System.out.println("| "+ n1 + " / " + n2 + " = " + resultado);
                    break;
                case 2:
                    System.out.println("| Subtração            |");
                    System.out.println("| Digite o 1º Numero : ");
                    n1 = ler.nextFloat();
                    System.out.println("| Digite o 2º Numero : ");
                    n2 = ler.nextFloat();
                    resultado= n1-n2;
                    System.out.println("| "+ n1 + " - " + n2 + " = " + resultado);
                    break;
                case 1:
                    System.out.println("| Adição               |");
                    System.out.println("| Digite o 1º Numero : ");
                    n1 = ler.nextFloat();
                    System.out.println("| Digite o 2º Numero : ");
                    n2 = ler.nextFloat();
                    resultado= n1+n2;
                    System.out.println("| "+ n1 + " + " + n2 + " = " + resultado);
                    break;
                case 0:
                    System.out.println("| Saindo...             ");
                    break;
                default:
                    break;
            }
            
        // Espera 2 segundos para reexibir o menu
        try {
            // Pausa de 2 segundos usando TimeUnit
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        }
        
    }
}
