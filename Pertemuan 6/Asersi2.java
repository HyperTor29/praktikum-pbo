/*
	Asersi2.java  2/03/2023
	Nama      : Victorio Cristiansa Putra
	NIM       : 24060121130084
	Deskripsi : file asersi2
*/

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari != 0): "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+kelilingLingkaran);
    }
}

/*
 Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 Jawaban:
 Yaitu pada program Asersi2 ada pada parameter di assert, yaitu assert(jariJari > 0). Pada assert(jariJari > 0) ini akan mengeluarkan
 "jari-jari tidak boleh nol!!!" apabila bilangannya yaitu > 0, kondisi assert tersebut akan terus mengeluarkan output itu meskipun bilangannya tidak nol, contohnya bilangan negatif.
 Jadi parameter assert seharusnya assert(jariJari != 0) yang ketika dijalankan akan mengeluarkan  "jari-jari tidak boleh nol!!!" hanya pada selain kondisi jariJari != 0.
 */