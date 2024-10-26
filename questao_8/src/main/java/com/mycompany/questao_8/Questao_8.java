/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_8 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int num;
        String mensagem = "";
        
        System.out.print("Digite um numero:");
        num = ler.nextInt();
        
        for (int i = 0; i < 10; i++) {
            mensagem += num+" X "+i+" = "+(num*i)+"\n";
        }
        
        try {
            FileWriter arquivo = new FileWriter("C:\\Users\\c.nunes\\Desktop\\tabuada.txt");
            PrintWriter gravar = new PrintWriter(arquivo);
            
            gravar.printf(mensagem);
        
            arquivo.close();
            gravar.close();
        } catch (IOException e) {
            System.out.println("ERR:"+e.getMessage());
        }
    }
}
