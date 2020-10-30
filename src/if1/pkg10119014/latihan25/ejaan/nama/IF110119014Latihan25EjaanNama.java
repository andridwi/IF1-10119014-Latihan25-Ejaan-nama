/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan25.ejaan.nama;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IF110119014Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        String nama = scanner.next();
        System.out.println();
        System.out.printf("Ejaan untuk %s adalah : %n" , nama);
        for(int i = 0; i < nama. length();i++){
            System.out.printf("Huruf ke-%d : %c%n", i+1, nama.charAt(i));
        }
    }
    
}
