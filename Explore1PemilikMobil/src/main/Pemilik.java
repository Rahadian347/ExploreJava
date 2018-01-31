package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Pemilik {
	
	//inisiasi variable
	public static String nama;
	public static String alamat;
	public static int jumlahMobil = 0;
	public static String[] noPlatMobil;
	static String[] noPlatMobilBaru;
	public static int mobilBaru;
	public static int jualMobil;
	Scanner sc = new Scanner(System.in);
	
	//Constructor
	public Pemilik() {
		System.out.print("masukan nama pemilik	: ");
		nama = sc.nextLine();
		System.out.print("Masukan Alamat Pemilik	: ");
		alamat =sc.nextLine();
		do {
			System.out.print("Masukan Jumlah Mobil Pemilik	: ");
			jumlahMobil = sc.nextInt();
		}while (jumlahMobil > 5 || jumlahMobil < 0);
		noPlatMobil = new String[jumlahMobil];
		for (int i=0;i<jumlahMobil;i++) {
			Mobil newMobil = new Mobil(i);
			noPlatMobil[i] = newMobil.getNoPlat().get(i);
		}
	}
	//fungsi cetak Data Pemilik
	public static void cetakPemilik() {
		System.out.println("Nama Pemilik		: "+getNama());
		System.out.println("Alamat Pemilik		: "+getAlamat());
		System.out.println("Jumlah Mobil Pemilik	: "+getJumlahMobil());
		System.out.print("Daftar Plat Nomor Pemilik	: ");
		for (int i =0;i<getNoPlat().length;i++) {
			System.out.print(getNoPlat()[i]);
			if ((i+1) == getNoPlat().length) {
				System.out.print(". \n\n");
			} else {
				System.out.print(", ");
			}
		}
	}
	//fungsi cetak data Mobil
	public static void cetakMobil() {
		for (int i=0;i<jumlahMobil;i++) {
			System.out.println("Merek Mobil ke-"+(i+1)+"	: "+Mobil.getMerek().get(i));
			System.out.println("No Plat Mobil ke-"+(i+1)+"	: "+Mobil.getNoPlat().get(i));
			System.out.println("Tahun Keluar Mobil ke-"+(i+1)+"	: "+Mobil.getMerek().get(i));
			System.out.println("");
		}
	}
	//Method tambah Mobil
	public static void tambahMobil() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Berapa buah Mobil yang akan dibeli ? ");
		mobilBaru = sc.nextInt();
		jumlahMobil = jumlahMobil+mobilBaru;
		if (jumlahMobil > 5) {
			System.out.println("anda hanya boleh menambah mobil maksimal " + (5 - (jumlahMobil-mobilBaru)));
		}
		noPlatMobilBaru = new String[mobilBaru];
		for (int i=0;i<mobilBaru;i++) {
			Mobil newMobil = new Mobil(i+(jumlahMobil - mobilBaru));
			noPlatMobilBaru[i] = newMobil.getNoPlat().get(i+(jumlahMobil - mobilBaru));
		}
		noPlatMobil = joinArrayGeneric(noPlatMobil, noPlatMobilBaru);
	}
	//Method jual mobil
	public static void jualMobil() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Berapa buah Mobil yang akan dijual ?");
		jualMobil = sc.nextInt();
		if (jumlahMobil == 0 || jualMobil > jumlahMobil) {
			System.out.println("Maaf anda tidak punya mobil sebanyak itu !");
		}else {

			jumlahMobil = jumlahMobil - jualMobil;
			noPlatMobil = new String[jumlahMobil];
		}
	}
	
	//method join array
	static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }
        //T[] result = new T[length];
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);
        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
	 }
	
	//Method Getter
	public static String getNama() {
		nama = nama;
		return nama;
	}
	public static String getAlamat() {
		alamat = alamat;
		return alamat;
	}
	public static int getJumlahMobil() {
		jumlahMobil = jumlahMobil;
		return jumlahMobil;
	}
	public static String[] getNoPlat() {
		noPlatMobil = noPlatMobil;
		return noPlatMobil;
	}
}
