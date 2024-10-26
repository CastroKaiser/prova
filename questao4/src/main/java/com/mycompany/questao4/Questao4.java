/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao4;

import java.io.DataInput;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Questao4 {

    public static void main(String[] args) {
        DataInput ler;
        ler = new DataInput(System.in);
        int num;
        
        JOptionPane.showInputDialog("Digite um número");
        num = ler.nextLine();
    }
}
