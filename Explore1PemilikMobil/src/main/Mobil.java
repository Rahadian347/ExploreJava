package main;

public class Mobil {
	
	String merek, noPlat;
	long tahunKeluar;
//	
	//Constructor
	public Mobil(String a, String b, long c) {
		this.merek = a;
		this.noPlat = b;
		this.tahunKeluar = c;
		System.out.println("");
	}	
	//Method Getter
	public String getMerek() {
		this.merek = merek;
		return merek;
	}
	public String getNoPlat() {
		this.noPlat = noPlat;
		return noPlat;
	}
	public long getTahun() {
		this.tahunKeluar = tahunKeluar;
		return tahunKeluar;
	}
	//test
}
