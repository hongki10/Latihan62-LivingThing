/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan62.livingthing;

/**
 * Nama  : M Hongki Alfikram 
 * NIM   : 10119915
 * Kelas : IF-10K
 */

public class PBO10K10119901Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h = new Human();
        h.setNama("M Hongki Alfikram");
        
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
}