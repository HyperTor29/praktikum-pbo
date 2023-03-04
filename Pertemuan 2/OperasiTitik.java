
/* OperasiTitik.java 01/03/23
Penulis : Victorio Cristiansa Putra
Deskripsi : kelas yang berisi 2 buah prosedur untuk refleksi terhadap sumbu X dan sumbu Y */
class OperasiTitik {
    private void refleksiSumbuX(Titik titik) {
        double ordinat=titik.getOrdinat();
        ordinat=ordinat*-1;
        titik.setOrdinat(ordinat);
    }
     private void refleksiSumbuY(Titik titik){
        double absis=titik.getAbsis();
        absis=absis*-1;
        titik.setAbsis(absis);
     }

     public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
     }

    public Titik refleksiX(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }

}