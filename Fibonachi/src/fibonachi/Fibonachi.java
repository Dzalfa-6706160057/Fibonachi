/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Angka: ");
        int input = in.nextInt();
        long fibonachi[] = new long[input];
        
        fibonachi[0] = 0;
        fibonachi[1] = 1;
        
        for (int i = 0; i < input; i++) {
            System.out.print(fibonachi[i]);
            System.out.print(" ");
        }
        
        for (int i = 2; i < input; i++) {
            fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
        }
    }   
}
