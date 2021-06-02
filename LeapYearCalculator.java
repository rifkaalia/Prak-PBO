package controlStatementProject;
import java.util.Scanner;

public class LeapYearCalculator {
	public static void main (String[] args) {
		int pilih;
		do{
			Scanner in= new Scanner(System.in);
			int bulan;
			int tahun;
			String gg;
			String jumhari;
			System.out.print("Masukkan bulan dalam angka: ");
			bulan= in.nextInt();
			System.out.print("Masukkan tahun: ");
			tahun= in.nextInt();
			
			String jumhari1="31";
			String jumhari2="29";
			
			switch(bulan) {
			case 1:
				jumhari="31";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 1 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 1 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 2:
				if(((tahun%4==0)&&(tahun%100!=0))||(tahun%400==0)) {
					jumhari="29";
					if(jumhari.equals(jumhari2)) {
						gg="ganjil";
						System.out.println("Jumlah hari dalam bulan ke 2 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 29 hari.");
					}
					else {
						gg="genap";
						System.out.println("Jumlah hari dalam bulan ke 2 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 28 hari.");
					}
				}
				else {
					jumhari="28";
					if(jumhari.equals(jumhari2)) {
						gg="ganjil";
						System.out.println("Jumlah hari dalam bulan ke 2 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 29 hari.");
					}
					else {
						gg="genap";
						System.out.println("Jumlah hari dalam bulan ke 2 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 28 hari.");
					}
				}
				
				break;
				
			case 3:
				jumhari="31";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 3 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 3 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 4:
				jumhari="30";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 4 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 4 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 5:
				jumhari="31";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 5 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 5 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 6:
				jumhari="30";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 6 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 6 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 7:
				jumhari="31";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 7 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 7 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 8:
				jumhari="31";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 8 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 8 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 9:
				jumhari="30";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 9 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 9 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 10:
				jumhari="31";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 10 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 10 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 11:
				jumhari="30";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 11 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 11 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			case 12:
				jumhari="31";
				if(jumhari.equals(jumhari1)) {
					gg="ganjil";
					System.out.println("Jumlah hari dalam bulan ke 12 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 31 hari.");
				}
				else {
					gg="genap";
					System.out.println("Jumlah hari dalam bulan ke 12 pada tahun "+tahun+" adalah "+gg+", yaitu sebanyak 30 hari.");
				}
				break;
				
			default:
				System.out.println("Invalid Input");
			}
			System.out.println();
			System.out.println("Apakah anda ingin memasukkan bulan dan tahun yang lain? [1=Ya / 2=Tidak]");
			pilih= in.nextInt();
		}while (pilih==1);
	}
}
