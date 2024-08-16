/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex05;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;


/**
 *
 * Tabuada Personalizada: Crie um programa que solicite ao usuário um número e gere a 
 * tabuada desse número de 1 a 10 utilizando um laço FOR. O programa deve exibir o 
 * resultado de cada multiplicação.
 */
public class EX05 {

    public static void main(String[] args) {
        int op=0;
        int select=0;
        Scanner ler = new Scanner(System.in);
        boolean repetir=true;
        
        
        while (repetir==true){

            System.out.println("------------------------");
            System.out.println("|  Tabuada Master      |");
            System.out.println("------------------------");
            System.out.println("|  ");
            System.out.println("| Digite o numero que seja saber a tabuada: ");
            op = ler.nextInt();
            System.out.println("|  ");

            for (int i = 0 ; i<=10; i++){
                System.out.println("| "+ op + " x "+i+" = "+ i*op);

            }

            System.out.println("|  ");
            System.out.println("| Deseja saber a tabuada de outro numero?");
            System.out.println("| (1) SIM / (2) NÃO : ");
            select = ler.nextInt();
            if (select!=1){
                repetir=false;
                System.out.println("| Saindo... ");
            } else {
                repetir=true;
            }
        }

    }
}
