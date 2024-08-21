/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modifier;

/**
 *
 * @author DELL
 */

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

import modifier.person;

public class author {

    person p = new person();

    public author(){
        //akan terjadi error di atas karena atribut name
        //telah diberikan modifier protected

        p.name = "Petani Kode";
    }

}
