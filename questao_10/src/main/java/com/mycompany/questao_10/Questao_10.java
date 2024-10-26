/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Questao_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdProduto;
        String mensagem = "";
        
        System.out.print("Quantos produtos deseja cadastrar:");
        qtdProduto = ler.nextInt();
        
        String[] nome = new String[qtdProduto];
        double[] valor = new double[qtdProduto];
        ler.nextLine();
        
        for (int i = 0; i < qtdProduto; i++) {
            System.out.print("Qual nome do "+(i+1)+" produto:");
            nome[i] = ler.nextLine();
            
            System.out.print("Qual valor do produto "+nome[i]+":");
            valor[i] = ler.nextDouble();
            
            ler.nextLine();
            
            mensagem += "Produto:"+nome[i]+"\nValor:"+valor[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,mensagem);
        
        try {
            FileWriter arquivo = new FileWriter("C:\\Users\\c.nunes\\Desktop\\produtos.txt");
            PrintWriter gravar = new PrintWriter(arquivo);
            
            gravar.printf(mensagem);
        
            arquivo.close();
            gravar.close();
        } catch (IOException e) {
            System.out.println("ERR:"+e.getMessage());
        }
    }
}
