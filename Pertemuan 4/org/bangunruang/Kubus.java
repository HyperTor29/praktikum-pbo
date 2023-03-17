/**
 * File      : Kubus.java 15/03/23
 * Penulis   : Victorio Cristiansa Putra / 24060121130084
 * Deskripsi : representasi dasar dari objek kubus, turunan kelas poligon
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungLuasAlas(){
        return this.permukaan.hitungLuas();
    }

    public double hitungVolume(){
        return this.permukaan.hitungLuas() * this.permukaan.getPanjangSisi();
    }
}
