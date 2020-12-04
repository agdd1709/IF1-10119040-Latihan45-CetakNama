/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  :10119040
 * Kelas: IF1
 * Program menampilkan nama dengan metode
 * pendekatan berbasis objek
 */
public class IF110119040Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======Aplikasi Pencetakan Nama====== ");
        Scanner input = new Scanner(System.in);
        Printer hasil = new Printer();
        System.out.print("Masukkan nama anda : ");
        hasil.setNama(input.nextLine()) ;
        System.out.print("Mau cetak nama berapa kali? : ");
        hasil.setJmlcetak( input.nextInt()) ;
         
     hasil.cetak(hasil.getNama());
        hasil.cetak1(hasil.getJmlcetak(),hasil.getNama());
    }
    
}
