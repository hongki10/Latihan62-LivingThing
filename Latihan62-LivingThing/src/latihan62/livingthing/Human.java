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

public class Human extends LivingThing 
{
    private String nama;

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    public void walk(String nama) 
    {
        System.out.println(nama + " sedang berjalan");
    }

    void setNama(String fauzan_Muhammad_Abdussalam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void breath(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void eat(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}