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

public class persegi extends bangundatar{

    int sisi;
    
    public persegi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }
    
    @Override
    public float keliling(){
        return this.sisi * 4;
    }
}