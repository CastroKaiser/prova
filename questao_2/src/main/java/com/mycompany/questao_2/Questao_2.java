/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_2;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        int mes;
        int dias;
        
        System.out.print("Digite a sua idade:");
        idade = ler.nextInt();
        
        System.out.print("Digite os meses:");
        mes = ler.nextInt();
        
        System.out.println("Digite os dias:");
        dias = ler.nextInt();
        
        System.out.println(idade+" anos, "+mes+" meses e "+dias+" dias = "+((idade*365)+(mes*30)+dias)+" dias.");
        
    }
}
