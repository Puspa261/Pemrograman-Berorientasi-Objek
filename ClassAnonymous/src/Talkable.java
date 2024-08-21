/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

interface Talkable{

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

  void sayHello();
}

// implementasi dan langsung digunakan
new Talkable(){

  @override
  void sayHello(){
    System.out.println("Hello World!");
  }

}.sayHello(); 
// ^ karena ini anonymous objek, 
//   jadi kita bisa langsung panggil methodnya