/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

/**
 *
 *  Sistema de Login: Desenvolva um programa que simule um sistema de login simples. O 
 *  programa deve solicitar o nome de usuário e senha, e permitir até 3 tentativas. Utilize 
 *  WHILE para controlar o número de tentativas e IF-ELSE para verificar a autenticidade dos 
 *  dados.
 */
public class EX04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String loginSecure = "eu";
        String pwdSecure = "pwd";
        String loginEnt = "";
        String pwdEnt = "";
        int tentativas=0;
        boolean liberaAcesso=false;
        
        while( liberaAcesso!=true){

            System.out.println("------------------------");
            System.out.println("|   Login System v1.1   ");
            System.out.println("------------------------");
            System.out.println("| Efetue Login         |");
            System.out.println("|     ");
            System.out.println("| Nome: ");
            loginEnt = ler.nextLine();
            System.out.println("|     ");
            System.out.println("| Senha:  ");
            pwdEnt = ler.nextLine();
            System.out.println("| Verificando...    ");
            System.out.println("|     ");

            try {
                // Pausa de 2 segundos usando TimeUnit
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            if (loginSecure.equals(loginEnt)& pwdSecure.equals(pwdEnt)){
                System.out.println("| Login efeturado com sucesso!   ");
                System.out.println("| Entrando...");
                liberaAcesso=true;
                break;
            } else if (!loginSecure.equals(loginEnt) | !pwdSecure.equals(pwdEnt)){
                System.out.println("|     ");
                System.out.println("| Usuario ou Senha incorretos!   ");
                System.out.println("| Tente novanente.   ");
                if (tentativas>=2){
                    System.out.println("|     ");
                    System.out.println("| Você excedeu o numero de (3) tentativas permitido!   ");
                    System.out.println("| Saindo do sistema...");
                    break;
                } else {
                    tentativas++;
                }
            }
        
            
        
        }

    }
}
