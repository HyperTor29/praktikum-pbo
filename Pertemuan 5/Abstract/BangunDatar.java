/*
	BangunDatar.java  28/03/2023
	Nama      : Victorio Cristiansa Putra
	NIM       : 24060121130084
	Deskripsi : file superclass untuk BangunDatar
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}