package main;
import java.util.Scanner;

public class MainClass {
	static Scanner scn = new Scanner(System.in);
	static byte pilihan;
	static Pemilik newPemilik = new Pemilik();
	
	public static void main(String[] args) {
		menu();
		
	}
	
	public static void menu() {
		do {
			System.out.println("===Program Jual Beli Mobil===");
			System.out.println("Menu Utama");
			System.out.println("1. Cetak Data Pemilik");
			System.out.println("2. Cetak Data Mobil");
			System.out.println("3. Jual Mobil Pemilik");
			System.out.println("4. Beli Mobil");
			System.out.println("5. Keluar");
			System.out.println("Pilihan [1/2/3/4/5]");
			pilihan = scn.nextByte();
			switch (pilihan) {
				case 1:
					newPemilik.cetakPemilik();
					System.out.println();
					break;
				case 2:
					System.out.println();
					newPemilik.cetakMobil();
					break;
				case 3:
					System.out.println();
					newPemilik.jualMobil();
					break;
				case 4:
					System.out.println();
					newPemilik.tambahMobil();
					break;
				case 5:
					System.out.println();
					System.out.println("Hatur Thank you !");
					break;
					default:
						System.out.println("Invalid Number !");
						System.out.println();
						break;
			}
		}
		while(pilihan != 5);
	}

}
