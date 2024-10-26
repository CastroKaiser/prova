/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_7;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String jogadorOne, jogadorTwo, nomeFilme, chute;
        String[] dicas = new String[5];
        
        System.out.print("Digite o nome do jogador 1:");
        jogadorOne = ler.nextLine();
        
        System.out.print("Digite o nome do filme:");
        nomeFilme = ler.nextLine();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a "+(i+1)+" dica:");
            dicas[i] = ler.nextLine();
        }
        
        System.out.print("Digite o nome do jogador 2:");
        jogadorTwo = ler.nextLine();
        
        for (int i = 0; i < 5; i++) {
            System.out.println(jogadorTwo+", a pista "+(i+1)+" e:"+dicas[i]);
            System.out.print("\nQual o nome do filme:");
            chute = ler.nextLine();
            if (chute.equals(nomeFilme)) {
                System.out.println("Parabens "+jogadorTwo+" voce ganhou!");
                i = 4;
            } else {
                System.out.println(jogadorTwo+", voce errou!");
            }
        }
        
        
    }
}
