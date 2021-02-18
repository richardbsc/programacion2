/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.util.Scanner;
 
public class ordenar {
 
    private static Scanner sc;
 
    public static void main(String[] args) {
        int num;
        sc = new Scanner(System.in);
        System.out.print("Introduce un número para invertir: ");
        num = sc.nextInt();
        sc.close();
        System.out.printf("%nEl número %d invertido es el %d", num, invertirNumero(num) );
    }
     
    private static int invertirNumero(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;
    }
}