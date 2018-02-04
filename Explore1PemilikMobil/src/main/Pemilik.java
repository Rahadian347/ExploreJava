package main;
import java.util.Scanner;
import java.util.Arrays;
import main.Mobil;


public class Pemilik {
	
	//inisiasi variable
	String nama;
	String alamat;
	int jumlahMobil = 0;
	String[][] mobil = new String[5][3];
	String[] noPlatMobil = new String[5];
	String merek, noPlat;
	long tahunKeluar;
	
	Scanner sc = new Scanner(System.in);
	
	public Pemilik() {
		System.out.print("masukan nama pemilik	: ");nama = sc.nextLine();		
		System.out.print("Masukan Alamat Pemilik	: ");alamat =sc.nextLine();		
		do {
			System.out.print("Masukan Jumlah Mobil Pemilik	: ");jumlahMobil = sc.nextInt();			
		} while (jumlahMobil > 5 || jumlahMobil < 0);
		
		for (int i = 0; i < jumlahMobil;i++) {
			sc.nextLine();
			System.out.print("Masukan Merek Mobil ke-" + (i+1) + " : ");
			merek = sc.nextLine();
			System.out.print("Masukan No Plat Mobil ke-" + (i+1) + " : ");
			noPlat = sc.nextLine();
			System.out.print("Masukan Tahun Keluaran Mobil ke-" + (i+1) + " : ");
			tahunKeluar = sc.nextLong();
			Mobil objectMobil = new Mobil(merek, noPlat, tahunKeluar);
			for (int j = 0; j < 3;j++){
				mobil[i][0] = merek;
				mobil[i][1] = noPlat;
				mobil[i][2] = Long.toString(tahunKeluar);
				noPlatMobil[i] = mobil[i][2];
			}
		}
		cetakPemilik();
		cetakMobil();
	}
	//fungsi cetak Data Pemilik
	public void cetakPemilik() {
		System.out.println("===== DATA PEMILIK MOBIL =====");
		System.out.println("Nama Pemilik			: "+getNama());
		System.out.println("Alamat Pemilik			: "+getAlamat());
		System.out.println("Jumlah Mobil Pemilik		: "+getJumlahMobil());
		System.out.print("Daftar Plat Nomor Pemilik	: ");
		for (int i =0;i<jumlahMobil;i++) {
			System.out.print(getNoPlat()[i]);
			if ((i+1) == jumlahMobil) {
				System.out.println(". ");
			} else {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
	}
//	//fungsi cetak data Mobil
	public void cetakMobil() {
		for (int i=0;i<jumlahMobil;i++) {
			System.out.println("Merek Mobil ke-"+(i+1)+"	: "+mobil[i][0]);
			System.out.println("No Plat Mobil ke-"+(i+1)+"	: "+mobil[i][1]);
			System.out.println("Tahun Keluar Mobil ke-"+(i+1)+"	: "+mobil[i][2]);
			System.out.println("");
		}
	}
	//Method tambah Mobil
	public void tambahMobil() {
		System.out.print("Berapa buah Mobil yang akan dibeli ? ");
		int mobilBaru = sc.nextInt();
		if ((jumlahMobil+mobilBaru) > 5) {
			System.out.println("anda hanya boleh menambah mobil maksimal " + (5 - jumlahMobil));
		} else {

			for (int i = jumlahMobil; i < (jumlahMobil+mobilBaru);i++) {
				sc.nextLine();
				System.out.print("Masukan Merek Mobil ke-" + (i+1) + " : ");
				merek = sc.nextLine();
				System.out.print("Masukan No Plat Mobil ke-" + (i+1) + " : ");
				noPlat = sc.nextLine();
				System.out.print("Masukan Tahun Keluaran Mobil ke-" + (i+1) + " : ");
				tahunKeluar = sc.nextLong();
				Mobil objectMobil = new Mobil(merek, noPlat, tahunKeluar);
				for (int j = 0; j < 3;j++){
					mobil[i][0] = merek;
					mobil[i][1] = noPlat;
					mobil[i][2] = Long.toString(tahunKeluar);
					noPlatMobil[i] = mobil[i][2];
				}
			}
			jumlahMobil = jumlahMobil+mobilBaru;
			cetakPemilik();
			cetakMobil();
		}
	}
	//Method jual mobil coy
	public void jualMobil() {
		System.out.print("Berapa buah Mobil yang akan dijual ?");
		int jualMobil = sc.nextInt();
		if (jumlahMobil == 0 || jualMobil > jumlahMobil) {
			System.out.println("Maaf anda tidak punya mobil sebanyak itu !");
		} else {

			jumlahMobil = jumlahMobil - jualMobil;
			cetakPemilik();
			cetakMobil();
		}
	}
	
	//inisiasi variable
//	public static String nama;
//	public static String alamat;
//	public static int jumlahMobil = 0;
//	public static String[] noPlatMobil;
//	static String[] noPlatMobilBaru;
//	public static int mobilBaru;
//	public static int jualMobil;
//	Scanner sc = new Scanner(System.in);
//	
//	//Constructor
//	public Pemilik() {
	
//	int[] org = new int[] {1, 2 ,3};
//	
//	int[] copy = Arrays.copyOf(org, 2);
//	
//	for (int i = org.length; i < copy.length; i++)
//	copy[i] = 5;
//
//	for (int i = 0; i < copy.length; i++)
//		System.out.print(copy[i] + " ");
	
//		System.out.print("masukan nama pemilik	: ");
//		nama = sc.nextLine();
//		System.out.print("Masukan Alamat Pemilik	: ");
//		alamat =sc.nextLine();
//		do {
//			System.out.print("Masukan Jumlah Mobil Pemilik	: ");
//			jumlahMobil = sc.nextInt();
//		}while (jumlahMobil > 5 || jumlahMobil < 0);
//		noPlatMobil = new String[jumlahMobil];
//		for (int i=0;i<jumlahMobil;i++) {
//			Mobil newMobil = new Mobil(i);
//			noPlatMobil[i] = newMobil.getNoPlat().get(i);
//		}
//	}
//	//fungsi cetak Data Pemilik
//	public static void cetakPemilik() {
//		System.out.println("Nama Pemilik		: "+getNama());
//		System.out.println("Alamat Pemilik		: "+getAlamat());
//		System.out.println("Jumlah Mobil Pemilik	: "+getJumlahMobil());
//		System.out.print("Daftar Plat Nomor Pemilik	: ");
//		for (int i =0;i<getNoPlat().length;i++) {
//			System.out.print(getNoPlat()[i]);
//			if ((i+1) == getNoPlat().length) {
//				System.out.print(". \n\n");
//			} else {
//				System.out.print(", ");
//			}
//		}
//		System.out.println("\n");
//	}
//	//fungsi cetak data Mobil
//	public static void cetakMobil() {
//		for (int i=0;i<jumlahMobil;i++) {
//			System.out.println("Merek Mobil ke-"+(i+1)+"	: "+Mobil.getMerek().get(i));
//			System.out.println("No Plat Mobil ke-"+(i+1)+"	: "+Mobil.getNoPlat().get(i));
//			System.out.println("Tahun Keluar Mobil ke-"+(i+1)+"	: "+Mobil.getMerek().get(i));
//			System.out.println("");
//		}
//	}
	//Method tambah Mobil
//	public static void tambahMobil() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Berapa buah Mobil yang akan dibeli ? ");
//		mobilBaru = sc.nextInt();
//		jumlahMobil = jumlahMobil+mobilBaru;
//		if (jumlahMobil > 5) {
//			System.out.println("anda hanya boleh menambah mobil maksimal " + (5 - (jumlahMobil-mobilBaru)));
//			jumlahMobil = jumlahMobil - mobilBaru;
//		} else {
//
//			noPlatMobilBaru = new String[mobilBaru];
//			for (int i=0;i<mobilBaru;i++) {
//				Mobil newMobil = new Mobil(i+(jumlahMobil - mobilBaru));
//				noPlatMobilBaru[i] = newMobil.getNoPlat().get(i+(jumlahMobil - mobilBaru));
//			}
//			noPlatMobil = joinArrayGeneric(noPlatMobil, noPlatMobilBaru);
//		}
//	}
	
//	public static void tambahMobil() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Berapa buah Mobil yang akan dibeli ? ");
//		
//		mobilBaru = sc.nextInt();
//		jumlahMobil = jumlahMobil+mobilBaru;
//		if (jumlahMobil > 5) {
//			System.out.println("anda hanya boleh menambah mobil maksimal " + (5 - (jumlahMobil-mobilBaru)));
//			jumlahMobil = jumlahMobil - mobilBaru;
//		} else {
//
//			noPlatMobil = Arrays.copyOf(noPlatMobil, jumlahMobil);
//			for (int i = 0; i < noPlatMobil.length;i++) {
//				System.out.print(noPlatMobil[i]);
//			}
//		}
//	}
//	
//	//Method jual mobil
//	public static void jualMobil() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Berapa buah Mobil yang akan dijual ?");
//		jualMobil = sc.nextInt();
//		if (jumlahMobil == 0 || jualMobil > jumlahMobil) {
//			System.out.println("Maaf anda tidak punya mobil sebanyak itu !");
//		} else {
//
//			jumlahMobil = jumlahMobil - jualMobil;
//			noPlatMobil = new String[jumlahMobil];
//		}
//	}
//	
//	//method join array
//	static <T> T[] joinArrayGeneric(T[]... arrays) {
//        int length = 0;
//        for (T[] array : arrays) {
//            length += array.length;
//        }
//        //T[] result = new T[length];
//        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);
//        int offset = 0;
//        for (T[] array : arrays) {
//            System.arraycopy(array, 0, result, offset, array.length);
//            offset += array.length;
//        }
//        return result;
//	 }
//	
//	//Method Getter
	public  String getNama() {
		nama = nama;
		return nama;
	}
	public String getAlamat() {
		alamat = alamat;
		return alamat;
	}
	public int getJumlahMobil() {
		jumlahMobil = jumlahMobil;
		return jumlahMobil;
	}
	public String[] getNoPlat() {
		noPlatMobil = noPlatMobil;
		return noPlatMobil;
	}
}
