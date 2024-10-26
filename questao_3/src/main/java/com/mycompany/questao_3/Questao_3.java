/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Questao_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] cafe = new int[3];
        double[] valor = new double[3];
        int totalCafe = 0;
        double totalPreco = 0;
        int escolha;
        boolean verificacao = true;
        String mensagem = "";
        
        
        do{
            System.out.print("1 - Cafe expresso\n2 - Cafe capuccino\n3 - Cafe com leite\n4 - Totalizar Vendas\nEscolha seu cafe:");
            escolha = ler.nextInt();
            if (escolha > 4 || escolha < 1) {
                System.out.println("\nEscolha Invalida");
            } else {
                if (escolha < 4) {
                    ler.nextLine();
                    cafe[escolha-1]++;
                    totalCafe++;
                    if (escolha == 1) {
                        valor[escolha-1] = valor[escolha-1] + 0.75;
                    } else if (escolha == 2) {
                        valor[escolha-1] = valor[escolha-1] + 1;
                    } else {
                        valor[escolha-1] = valor[escolha-1] + 1.25;
                    }
                } else {
                    for (int i = 0; i < 3; i++) {
                        mensagem += "Quantidade Cafe Expresso:"+cafe[i]+"\nValor Total:"+valor[i]+"\n";
                        totalPreco += valor[i];
                    }
                    mensagem += "Quantidade total:"+totalCafe+"\nValor Total:"+totalPreco;
                    JOptionPane.showMessageDialog(null, mensagem);
                    verificacao = false;
                }
            }
        }while(verificacao == true);
        
        
    }
}
