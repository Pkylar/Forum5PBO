/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forum5;

/**
 *
 * @author LENOVO
 */
public class Forum5 {

    public static void main(String[] args) {
        // Buat objek Buku
        Cbuku buku = new Cbuku("Romeo & Juliet", "Buku Bijak", 1595, "William Shakespeare");
        System.out.println(buku.getInfo());

        // Buat objek Majalah
        Cmajalah majalah = new Cmajalah("Majalah Bobo", "Kelompok Kompas Gramedia", 1973, "29, Jacob Oetama");
        System.out.println(majalah.getInfo());
    }
}
