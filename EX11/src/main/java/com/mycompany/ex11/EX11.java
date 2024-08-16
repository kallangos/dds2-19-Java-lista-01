/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex11;
import java.util.Scanner;

/**
 *
 *  Conversor de Temperatura: Crie um programa que converta uma temperatura de 
 * Celsius para Fahrenheit e vice-versa. O programa deve solicitar ao usuário a temperatura e 
 * a unidade de origem, e utilizar IF-ELSE para realizar a conversão correta.
 */
public class EX11 {

    public static void main(String[] args) {
        float temperatura = 0 ;
        float temperaturaconvertida = 0 ;
        int tipoTemperadura = 0 ;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|   Conversor de Temperatura                        |");
        System.out.println("-----------------------------------------------------");
        System.out.println("| ");
        System.out.println("| Digite a temperatura que deseja converter: ");
        temperatura = ler.nextFloat();
        System.out.println("| ");
        System.out.println("| Esta temperatura esta em Celsius ou Fahrenheit ?");
        System.out.println("| Digite (1) Celsius ou (2) Fahrenheit : ");
        tipoTemperadura = ler.nextInt();
        
        if (tipoTemperadura==1){
            temperaturaconvertida = (temperatura * 9 / 5) + 32;
            System.out.println("| ");
            System.out.println("| " + temperatura + "ºCelsius = "+ temperaturaconvertida + "º Fahrenheit.");
        } else if (tipoTemperadura==2){
            temperaturaconvertida = (temperatura -32 ) * 5 / 9;
            System.out.println("| ");
            System.out.println("| "+ temperatura + "º Fahrenheit = "+ temperaturaconvertida + " Celsius.");
        } else {
            System.out.println("| Opçao Invalida! ");
        }
        
        System.out.println("| ");
        System.out.println("| Saindo...");
        ler.close();
    }
}
