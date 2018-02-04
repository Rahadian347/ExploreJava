package driver;

import java.util.Scanner;

import object.NA;

public class NaTester {
	static Scanner scn = new Scanner(System.in);
	static byte pilihan;
	static NA obj1 = new NA();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}
	
	public static void menu() {
		do {
			System.out.println("===Program Nilai Akhir===");
			System.out.println("Menu Utaman");
			System.out.println("1. Input Data");
			System.out.println("2. Cetak Data");
			System.out.println("3. Keluar");
			System.out.println("Pilihan [1/2/3]");
			pilihan = scn.nextByte();
			switch (pilihan) {
				case 1:
					System.out.println();
					obj1.input();
					break;
				case 2:
					System.out.println();
					obj1.terbesar();
					break;
				
				case 3:
					System.out.println("Terima Kasih.....!");
					break;
					default:
						System.out.println("Invalid Number !");
						System.out.println();
						break;
			}
		}
		while(pilihan != 3);
	}
}
