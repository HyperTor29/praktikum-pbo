/*
	Programmer.java  08/05/2023
	Nama      : Victorio Cristiansa Putra
	NIM       : 24060121130084
	Deskripsi : file subclass pegawai
*/

public class Programmer extends Pegawai {
    protected int tunjangan = 450000;

    public Programmer(String nama){
        setNama(nama);
    }

    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}