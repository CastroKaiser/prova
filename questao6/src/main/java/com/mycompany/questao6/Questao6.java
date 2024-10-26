/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Questao6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 1, qtdValores = 0, soma = 0;
        double media;
        
        while(num != 0){
            System.out.print("Digite qualquer numero ou 0 para sair:");
            num = ler.nextInt();
            if (num != 0) {
                soma += num;
                qtdValores++;
            } else {
                JOptionPane.showMessageDialog(null, "Media:"+(soma/qtdValores)+"\nSoma:"+soma+"\nQuantidade Valores:"+qtdValores);
                return;
            }
        }
    }
}
