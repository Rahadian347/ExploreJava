package main;
import java.util.Scanner;

public class MainClass {
	static Scanner scn = new Scanner(System.in);
	static byte pilihan;
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		do {
			System.out.println("===Program Jual Beli Mobil===");
			System.out.println("Menu Utama");
			System.out.println("1. Input Data Pemilik dan Mobil");
			System.out.println("2. Cetak Data Pemilik");
			System.out.println("3. Cetak Data Mobil");
			System.out.println("4. Jual Mobil Pemilik");
			System.out.println("5. Beli Mobil");
			System.out.println("6. Keluar");
			System.out.println("Pilihan [1/2/3/4/5/6]");
			pilihan = scn.nextByte();
			switch (pilihan) {
				case 1:
					System.out.println();
					Pemilik newPemilik = new Pemilik();
					break;
				case 2:
					System.out.println();
					Pemilik.cetakPemilik();
					break;
				case 3:
					System.out.println();
					Pemilik.cetakMobil();
					break;
				case 4:
					System.out.println();
					Pemilik.jualMobil();
					break;
				case 5:
					System.out.println();
					Pemilik.tambahMobil();
					break;
				case 6:
					System.out.println();
					System.out.println("Hatur Thank you !");
					break;
					default:
						System.out.println("Invalid Number !");
						System.out.println();
						break;
			}
		}
		while(pilihan != 6);
	}

}
