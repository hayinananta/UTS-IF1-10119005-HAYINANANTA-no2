/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119005.hayinananta.no2;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini untuk menampilkan program penarikan uang seperti
 *                     kasir dengan berbasis pendekatan Objek
 */
public class UTSIF110119005HAYINANANTANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        Tabungan tabungan = new Tabungan();
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        int saldo = scanner.nextInt();
        tabungan.Tabungan(saldo);
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    }
    
}
