/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex18;
import java.util.Scanner;

/**
 *
 * @author Thor
 */
public class EX18 {

    public static void main(String[] args) {
        // [0]carro,[1]moto,[2]caminhao       
        double[] listaPedadios = {12.50,9.50,16.50}; 
        int tipoVeiculo = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|              Systema de pedagio                   |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|          Informe qual e o seu veiculo             |");
        System.out.println("|                                                   |");
        System.out.println("|      (1) Carro   (2) Moto   (3) Caminhao          |");
        System.out.println("| ");
        tipoVeiculo = ler.nextInt();
        if (tipoVeiculo==1){
            System.out.println("| O Valor do pedagio é : R$ " + listaPedadios[0]);
        } else if (tipoVeiculo==2){
            System.out.println("| O Valor do pedagio é : R$ " + listaPedadios[1]);
        } if (tipoVeiculo==3){
            System.out.println("| O Valor do pedagio é : R$ " + listaPedadios[2]);
        }
        
        System.out.println("| ");
        System.out.println("| Saindo...");
        
    }
}
