/*
	BujurSangkar.java  28/03/2023
	Nama      : Victorio Cristiansa Putra
	NIM       : 24060121130084
	Deskripsi : 4file subclass untuk bujursangkar
*/

public class BujurSangkar extends BangunDatar {
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

/*
apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi 
metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 
Jawaban:
Terjadi compile error ketika program dijalankan, ini bisa terjadi karena class BujurSangkar harus mengimplementasikan
method abstract yang ada pada abstract class BangunDatar yaitu method hitungLuas(double sisi)
 */