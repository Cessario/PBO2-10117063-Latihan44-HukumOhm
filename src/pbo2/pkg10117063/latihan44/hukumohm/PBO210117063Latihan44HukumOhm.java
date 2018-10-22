/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan44.hukumohm;

import java.util.Scanner;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : menghitung kuat arus & hambatan
 */
public class PBO210117063Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kuat Arus : ");
        int ka = sc.nextInt();
       
        System.out.println("Hambatan : ");
        int ha= sc.nextInt();
        Baterai bete = new Baterai(ka, ha);
        
        System.out.println("Hasil Tegangan : " +bete.hitungTegangan());
            
    }
    
}
