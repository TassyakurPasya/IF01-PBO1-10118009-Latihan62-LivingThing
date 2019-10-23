/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg1011009.latihan62.livingthing;

/**
 *Nama : Tassyakur Pasya
 *NIM : 10118009
 *Kelas : IF-01
 *Deskripsi Program : Living Thing
 * @author Lenovo
 */
public class IF01PBO11011009Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h= new Human();
        h.setNama("Tassyakur Pasya");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
    
}
