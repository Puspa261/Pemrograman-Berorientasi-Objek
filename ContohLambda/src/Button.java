/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

public class Button {

// Nama  : Puspa Khairunnisa
// Kelas : 3MID

    private Clickable action;
    
    void setClickAction(Clickable action){
        this.action = action;
    }
    
    void doClick(){
        action.onClick();
    }
}