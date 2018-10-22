/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan44.hukumohm;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : menhitung hambatan  & kuat arus
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        System.out.println("====Hukum Ohm====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial ");
        System.out.println("pada ujumg-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    public float hitungTegangan(){
        return hambatan * kuatArus ;
    }
    
    
    
}
