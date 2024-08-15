/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;
import java.util.Scanner;

/**
 *
 * @author Thor
 */
public class EX01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float media = 0;
        
        System.out.println("Entre com a 1º nota do aluno: ");
        float n1 = ler.nextFloat();
        System.out.println("Entre com a 2º nota do aluno: ");
        float n2 = ler.nextFloat();
        System.out.println("Entre com a 2º nota do aluno: ");
        float n3 = ler.nextFloat();
        
        media = (n1+n2+n3)/3;
                
        if (media>=7) {
            System.out.println("Aluno Aprovado!");
            System.out.println("Media = " + media);
        } else if (media>=5){
            System.out.println("Aluno em Recuperação!");
            System.out.println("Media = " + media);
            } else {
                System.out.println("Aluno Reprovado!");
                System.out.println("Media = " + media);
                }
    }
}
