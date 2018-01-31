package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobil {
	
	static ArrayList<String> merek = new ArrayList<String>();
	static ArrayList<String> noPlat = new ArrayList<String>();
	static ArrayList<Long> tahunKeluar = new ArrayList<Long>();	
	Scanner sc = new Scanner(System.in);
	
	//Constructor
	public Mobil(int i) {
		System.out.print("Masukan Merek Mobil ke-"+(i+1)+" : ");
		merek.add(sc.nextLine());
		System.out.print("Masukan Plat Nomor ke-"+(i+1)+" : ");
		noPlat.add(sc.nextLine());
		System.out.print("Masukan Tahun Kelua Mobil ke-"+(i+1)+" : ");
		tahunKeluar.add(sc.nextLong());
		System.out.println("");
	}	
	//Method Getter
	public static ArrayList<String> getMerek() {
		merek = merek;
		return merek;
	}
	public static ArrayList<String> getNoPlat() {
		noPlat = noPlat;
		return noPlat;
	}
	public static ArrayList<Long> getTahun() {
		tahunKeluar = tahunKeluar;
		return tahunKeluar;
	}
}
