/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

/**
 *
 * @author LENOVO
 */
public class Cmajalah extends ParentMedia {
         private String edisi;

    // Konstruktor
    public Cmajalah(String judul, String penerbit, int tahunTerbit, String edisi) {
        super(judul, penerbit, tahunTerbit);
        this.edisi = edisi;
    }

    @Override
    public String getInfo() {
        return String.format("%s, Edisi: %s", super.getInfo(), edisi);
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }
}
