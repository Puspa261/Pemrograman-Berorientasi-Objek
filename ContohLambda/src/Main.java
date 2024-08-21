/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

public class Main {

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

    public static void main(String[] args) {
        
        Button btn = new Button();
        String name = "Petani Kode";
        
        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(() -> {
            System.out.println("Tombol sudah diklik!");
            System.out.println("Yay!");
            System.out.println("Hello " + name);
        });
        
        // mencoba klik tombol
        btn.doClick();
        
    }
}
