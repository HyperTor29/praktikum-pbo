/*
	AngkaSialException.java  2/03/2023
	Nama      : Victorio Cristiansa Putra
	NIM       : 24060121130084
	Deskripsi : file AngkaSial, demonstrasi throw dan throws
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial"); //12
    }

    public static void main(string[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase) { //21
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jawab:
*Ketika eksepsi terjadi, baris 12 yang merujuk pada (System.out.println(angka+" bukan angka sial");) tidak akan dieksekusi,
 program tersebut akan mengeluarkan message eksepsi dan program akan berhenti berjalan.
*Baris ke-21 akan dieksekusi ketika kondisi eksepsi sudah terpenuhi, contohnya pada as.cobaAngka(13); yang ada di dalam try.
 kemudian catch akan dijalankan karena terdapat eksepsi yang terjadi.
 */
