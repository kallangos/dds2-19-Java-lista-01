/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex06;

import java.util.Scanner;

/**
 *
 * @author Thor
 */
public class EX06 {

    public static void main(String[] args) {
                
        Scanner ler = new Scanner(System.in);
        float peso = 0;
        float altura = 0;

        System.out.println("------------------------");
        System.out.println("|  Calculo de IMC      |");
        System.out.println("------------------------");
        System.out.println("|  ");
        System.out.println("| Digite o numero que seja saber a tabuada: ");
               
        System.out.println("| Entre com o peso(kg): ");
        peso = ler.nextFloat();
        System.out.println("| Entre com a altura(m) : ");

        altura = ler.nextFloat();
        
        float imc ;
        
        imc=(peso/(altura*altura));

        System.out.println("|  ");
        System.out.println("| Seu IMC é igual a : " + imc);
        System.out.println("|  ");
        
        if (imc<40){
            if ( imc>35 ){
                System.out.println("| Resultado: Obesidade Classe II.");
            }
            if (( imc>=30) & (imc<=34.9 )){
                System.out.println("| Resultado: Obesidade Classe I.");
            }
            if (( imc>=25) & (imc<=29.9 )){
                System.out.println("| Resultado: Excesso de Peso.");
            }
            if (( imc>=18.5) & (imc<=24.9 )){
                System.out.println("| Resultado: Peso Normal.");
            }
            if (imc<18.5){
                System.out.println("| Resultado: Abaixo do Peso Normal.");
            }
        }
        else {
            System.out.println("| Resultado: Obesidade Classe III.");
        }
        
        System.out.println("| Saindo...");
        System.out.println("|  ");

        
        
    }
}
