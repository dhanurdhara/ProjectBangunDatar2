/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author this
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang y = new PersegiPanjang();
        y.jumlahkan(10, 5);
        y.jumlahkan(3.6, 8);
        y.jumlahkan(6, 8.3);
        y.jumlahkan(5.6, 8.8);
        
        Persegi a = new Persegi();
        a.jumlahkan(4.5);
        a.jumlahkan(7);
        
        Lingkaran b = new Lingkaran();
        b.jumlahkan(5);
        b.jumlahkan(7.4);
        
        Segitiga c = new Segitiga();
        c.jumlahkan(8, 10);
        c.jumlahkan(8, 11.5);
        c.jumlahkan(12.2, 9);
        c.jumlahkan(13.9, 20.7);
    } 
}
