package object;

import java.util.*;
import java.util.Scanner;


public class NA {
	//inisialisasi Variable
	Scanner input = new Scanner(System.in);
	private int jumlah_mahasiswa;
	private int NA[] = new int[100];
	private int skor[][] = new int [100][100];
	private String in[] = new String[100];
	private int max = 0;
	private int i,k;
	private String nrpmax,nrpmin;
	
	//Getter
	public int getNRP(int x) {
		return skor[x][0];
	}
	public String getIn(int z) {
		return in[z];
	}
	
	//method pengganti setter
	public void input() {
		System.out.print("Masukan Jumlah Mahasiswa	: ");	
		
		do {
		    try {
		    	jumlah_mahasiswa = input.nextInt();

		        if (jumlah_mahasiswa >= 0 && jumlah_mahasiswa <= 1000) break;
		    } 
		    //error exception for input method
		    catch (InputMismatchException e) {
		    } 
		    finally {
		        input.nextLine();
		    }
		    System.out.print("Jumlah Data Mahasiswa tidak terbaca !\nMasukan Jumlah Mahasiswa	: ");
		} while (true);
		
		do {
		    try {
		    	for (k = 0; k < jumlah_mahasiswa;k++) {
					System.out.print("Masukan NRP Mahasiswa ke - "+ (k+1) + " :	");
					in[k] = input.next();
					System.out.print("Masukan Nilai Quis	: ");
					skor[k][0] = input.nextInt();
					System.out.print("Masukan Nilai UTS	: ");
					skor[k][1] = input.nextInt();
					System.out.print("Masukan Nilai UAS	: ");
					skor[k][2] = input.nextInt();
				}
		    	break;
		    } 
		    //error exception for input method
		    catch (InputMismatchException e) {
		    } 
		    finally {
		        input.nextLine();
		    }
		    System.out.print("Data Nilai Tidak Terbaca \n");
		} while (true);			
	}
	
	public int hitungNA() {
		NA[i] = (int) ((skor[i][0]*0.2) + (skor[i][1]*0.3) + (skor[i][2]*0.5));
		return NA[i];		
	}
	
	public void terbesar() {
		for (i = 0;i < jumlah_mahasiswa;i++) {
			if(hitungNA() > max) {
				max = hitungNA();
				nrpmax = in[i];
			}
		}
		for (i = 0;i < jumlah_mahasiswa;i++) {
			System.out.println("Data ke-" + (i+1));
			System.out.println("NRP \t	: "+(in[i]));
			System.out.println("QUIS \t	: "+skor[i][0]);
			System.out.println("UTS \t	: "+skor[i][1]);
			System.out.println("UAS \t	: "+skor[i][2]);
			System.out.println("NA \t	: "+NA[i]);
			System.out.println();
		}
		System.out.println("=======================");
		System.out.println("Rangking 1 dengan NRP	: "+nrpmax);
		System.out.println("Dengan Nilai Akhir(ip)	:"+max);
	}

}
