/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;
import java.util.Scanner;

/**
 *
 * 1. Sistema de Aprovação de Alunos: Crie um programa que receba as notas de um aluno em
 * três disciplinas e calcule sua média. Utilize estruturas IF e ELSE para determinar se o aluno
 * foi aprovado, reprovado ou está em recuperação com base na média (Aprovado: média ≥ 7,
 * Recuperação: 5 ≤ média < 7, Reprovado: média < 5)
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
