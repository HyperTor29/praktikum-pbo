/* Titik.java 01/03/23
Penulis : Victorio Cristiansa Putra
Deskripsi : kelas yang berisikan titik - titik yang sudah dibuat */

class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	public Titik() {
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public Titik(double x, double y) {
		absis = x;
		ordinat = y;
		counterTitik++;
	}

	public void setAbsis(double x) {
		absis = x;
	}
	
	public void setOrdinat(double y){
		ordinat = y;
	}

	public double getAbsis() {
		return absis;
	}

	public double getOrdinat() {
		return ordinat;
	}

	public int getCounterTitik(){
		return counterTitik;
	}
}
