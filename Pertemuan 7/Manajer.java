/*
	Manajer.java  08/05/2023
	Nama      : Victorio Cristiansa Putra
	NIM       : 24060121130084
	Deskripsi : file subclass pegawai
*/

public class Manajer extends Pegawai  {
    protected int tunjangan = 700000;

    public Manajer(String nama){
        setNama(nama);
    }

    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}