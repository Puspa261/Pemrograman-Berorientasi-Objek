/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topik5;

/**
 *
 * @author DELL
 */
public class OperatorLogika {

    // Nama  : Puspa Khairunnisa
    // Kelas : 3MID

    public static void main(String[] args){

        boolean a = true;
        boolean b = false;
        boolean c;

        // konjungsi (dan)
        c = a && b;
        System.out.println("true && false = " + c);

        // disjungsi (atau)
        c = a || b;
        System.out.println("true || false = " + c);

        // negasi (bukan)
        System.out.println("Negasi, !true = " + !a);

    }

}
