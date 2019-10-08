/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan25.ejaannama;

import java.util.Scanner;
import java.io.PrintStream;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Mengeja Nama
 */
public class PBOIF11K10118905Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Masukkan nama depan anda untuk dieja :");
    String nama = sc.nextLine();
    int panjang = nama.length();
    char [] arr_nama = nama.toCharArray();
    for (int i =0; 1 < panjang; i++){
        System.out.println("Huruf ke-"+(i+1)+":"+arr_nama[i]);
    
    }
    }
    
}
