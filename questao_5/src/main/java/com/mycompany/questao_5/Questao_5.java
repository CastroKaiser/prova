/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_5;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codigo, senha;
        
        System.out.print("Digite o Codigo:");
        codigo = ler.nextInt();
        if (codigo == 1234) {
            System.out.print("Digite a senha:");
            senha = ler.nextInt();
            if (senha == 9999) {
                System.out.println("Acesso permitido!");
            } else  {
                System.out.println("Senha incorreta!");
            }
        } else {
            System.out.print("Usuario Invalido!");
        }
        
        
    }
}
