/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contohpolimorfisme;

/**
 *
 * @author DELL
 */

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

public class Main {
    public static void main(String[] args) {
        
        bangundatar bangundatar = new bangundatar();
        persegi persegi = new persegi(4);
        segitiga segitiga = new segitiga(6, 3);
        lingkaran lingkaran = new lingkaran(50);
        
        // memanggil method luas dan keliling
        bangundatar.luas();
        bangundatar.keliling();
        
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}