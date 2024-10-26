/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Questao_11 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        int qtdParticipantes, contador = 0;
        String mensagem = "";
        
        System.out.print("Quantos participantes vao realizar a pesquisa:");
        qtdParticipantes = ler.nextInt();
        
        String[] genero = new String[qtdParticipantes];

        ler.nextLine();
        
        for (int i = 0; i < qtdParticipantes; i++) {
            System.out.print("Qual genero favorito do "+(i+1)+" participante:");
            genero[i] = ler.nextLine();
        }
        
        Set<String> contabilizar = new HashSet<>();
        String generoAtual;
        for (int i = 0; i < qtdParticipantes; i++) {
            contador = 0;
            generoAtual = genero[i];
            if (!contabilizar.contains(generoAtual)) {
                for (int j = 0; j < qtdParticipantes; j++) {
                    if (generoAtual.equals(genero[j])) {
                        contador++;
                    }
                }
                mensagem += "Genero:"+generoAtual+"\nQuantidade:"+contador+"\n";
                contabilizar.add(generoAtual);
            }
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
