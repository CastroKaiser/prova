/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_12;

import java.util.Scanner;


/**
 *
 * @author c.nunes
 */
public class Questao_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[11];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero:");
            num[i] = ler.nextInt();
        }
        
        for (int i = 0; i < (10-1); i++) {
            for (int j = 0; j < ((10-1)-i); j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.print("Insira outro numero:");
        int novo = ler.nextInt();
        
        int[] novoVetor = new int[11];
        
        for (int i = 0; i < 11; i++) {
            if (i == 9) {
                novoVetor[i+1] = novo;
            } else {
                novoVetor[i] = num[i];
            }
        }
        
        for (int i = 0; i < (11-1); i++) {
            for (int j = 0; j < ((11-1)-i); j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(novoVetor[i]+", ");
        }
    }
}
