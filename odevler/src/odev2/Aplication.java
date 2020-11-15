package odev2;

import java.util.Scanner;

public class Aplication {
		
private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Menu();		
		int islemsecimi = islemSec();				
		islemSecimi(islemsecimi);		
		scanner.close();
	}
	
	public static void islemSecimi(int islemsecimi) {
		
		switch (islemsecimi) {
			case 1:
				System.out.println("Toplama");
				makeTopla();
				break;
			case 2:
				System.out.println("Çikarma");
				makeCikar();
				break;
			case 3:
				System.out.println("Bölme");
				makeBol();
				break;
			case 4:
				System.out.println("Çarpma");
				makeCarp();
				break;
				default:
				System.out.println("Gecersiz secim yaptiniz !!!");
				break;
		}
	}
	
	
	public static void makeTopla() {
		
		System.out.println("Birinci sayi giriniz : ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("Ýkinci sayi giriniz : ");
		int sayi2 = scanner.nextInt();
		
		int toplam=sayi1+sayi2;
		System.out.println("Ýþlem Toplamý : "+toplam);
	}

	private static void makeCikar() {
	
		System.out.println("Birinci sayi giriniz : ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("Ýkinci sayi giriniz : ");
		int sayi2 = scanner.nextInt();
		
		int fark=sayi1-sayi2;
		System.out.println("Ýþlem farký : "+fark);
}
	
	private static void makeBol() {
		
		System.out.println("Birinci sayi giriniz : ");
		double sayi1 = scanner.nextDouble();
		
		System.out.println("Ýkinci sayi giriniz : ");
		double sayi2 = scanner.nextDouble();
		
		double sonuc=sayi1/sayi2;
		System.out.println("Bölme Ýþlem sonucu : "+sonuc);
	}
	
	private static void makeCarp() {
		
		System.out.println("Birinci sayi giriniz : ");
		double sayi1 = scanner.nextDouble();
		
		System.out.println("Ýkinci sayi giriniz : ");
		double sayi2 = scanner.nextDouble();
		
		double sonuc=sayi1*sayi2;
		System.out.println("Çarpma iþlem sonucu : "+sonuc);
	}
	
	
	private static void Menu() {
		
		System.out.println("<<- Hesap Makinesi ->>");
		System.out.println("1- Toplama");
		System.out.println("2- Çikarma");
		System.out.println("3- Bölme");
		System.out.println("4- Çarpma");
	}
	
	public static int islemSec() {
		
		System.out.println("Hesaplanacak islemi seçiniz .. ");
		String islemsecimi = scanner.nextLine();
		
		return Integer.parseInt(islemsecimi);
	}
	
}
