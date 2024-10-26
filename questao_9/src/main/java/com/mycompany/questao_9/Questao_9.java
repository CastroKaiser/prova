/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_9;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valorHour;
        int HoursByMonth;
        float salario;
        
        System.out.print("Quanto o funcionario ganha por hora:");
        valorHour = ler.nextInt();
        
        System.out.println("O numero de horas trabalhas no mes:");
        HoursByMonth = ler.nextInt();
        
        salario = (valorHour*HoursByMonth);
        
        System.out.println("Salario Bruto:"+salario);
        System.out.println("Imposto De Renda:"+(salario*0.11));
        System.out.println("INSS:"+(salario*0.08));
        System.out.println("Sindicato:"+(salario*0.05));
        System.out.println("Salario Liquido:"+(salario-(salario*0.24)));
    }
}
