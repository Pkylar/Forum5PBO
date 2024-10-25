/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

/**
 *
 * @author LENOVO
 */
public class Cbuku extends ParentMedia{
    private String penulis;

    // Konstruktor
    public Cbuku(String judul, String penerbit, int tahunTerbit, String penulis) {
        super(judul, penerbit, tahunTerbit);
        this.penulis = penulis;
    }

    @Override
    public String getInfo() {
        return String.format("%s, Penulis: %s", super.getInfo(), penulis);
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
