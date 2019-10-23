/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg1011009.latihan62.livingthing;

/**
 *
 * @author Lenovo
 */
public class Human extends LivingThing{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

    @Override
    public void walk(String nama) {
        System.out.println(nama+" Sedang Berjalan");
    }

    @Override
    public void eat(String nama) {
        System.out.println(nama+" Bernafas");
    }

    @Override
    public void breath(String nama) {
        System.out.println(nama+" Makan");
    }
    
}
