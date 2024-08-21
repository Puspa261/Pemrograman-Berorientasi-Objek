/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataKaryawan;

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DataKaryawan {
    public static void main(String[] args) {
        String nama, alamat;
        int usia, gaji;

        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT.Petani Kode ###");
        System.out.print("Nama Karyawan : ");

        // Menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan output lagi
        System.out.print("Alamat : ");
        // Menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.print("Usia : ");
        usia = keyboard.nextInt();

        System.out.print("Gaji : ");
        gaji = keyboard.nextInt();

        // Menampilkan apa yang sudah di simpan di variabel
        System.out.println("----------------------");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia + " Tahun");
        System.out.println("Gaji : Rp" + gaji);
    }
}
