/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

import java.io.FileWriter;
import java.io.IOException;

public class TulisFile {

    public static void main(String[] args) {

        String fileName = "src/puisi.txt";
        String fileContent = "Belajar membaca dan menulis file di Java!";
        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();
            
            System.out.println("File sudah ditulis ulang!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
}