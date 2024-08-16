/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex20;
import java.util.Scanner;

/**
 *
 *  Cálculo de Desconto: Desenvolva um programa que solicite ao usuário o valor de uma 
 * compra e o percentual de desconto. Utilize IF-ELSE para aplicar o desconto correto e exibir 
 * o valor final ao usuário.
 */
public class EX20 {

    public static void main(String[] args) {
        double vCompra, vDesconto = 0 ;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|              Calculo de Desconto                  |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|  Entre com o valor de uma compra : ");
        vCompra = ler.nextDouble();
        System.out.println("|  Entre com o percentual de desconto: ");
        vDesconto = ler.nextDouble();
        
        if (vDesconto>0){
            System.out.println("|  O valor final ao usuario : R$ " + (vCompra-((vCompra*vDesconto)/100)));
        } else {
            System.out.println("|  Nao ha deconsto para aplicar o valor se mantem o mesmo R$ " + vCompra);
        }
        
        System.out.println("|                                                   |");
        System.out.println("|  Saindo... ");        
    }
}
