/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ContohBufferReader;

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nama;
        
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader (System.in);

        // Membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi variabel nama dengan Bufferreader
        System.out.print("Inputkan nama : ");
        nama = br.readLine();

        // Tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
    }
}
