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
				System.out.println("�ikarma");
				makeCikar();
				break;
			case 3:
				System.out.println("B�lme");
				makeBol();
				break;
			case 4:
				System.out.println("�arpma");
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
		
		System.out.println("�kinci sayi giriniz : ");
		int sayi2 = scanner.nextInt();
		
		int toplam=sayi1+sayi2;
		System.out.println("��lem Toplam� : "+toplam);
	}

	private static void makeCikar() {
	
		System.out.println("Birinci sayi giriniz : ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("�kinci sayi giriniz : ");
		int sayi2 = scanner.nextInt();
		
		int fark=sayi1-sayi2;
		System.out.println("��lem fark� : "+fark);
}
	
	private static void makeBol() {
		
		System.out.println("Birinci sayi giriniz : ");
		double sayi1 = scanner.nextDouble();
		
		System.out.println("�kinci sayi giriniz : ");
		double sayi2 = scanner.nextDouble();
		
		double sonuc=sayi1/sayi2;
		System.out.println("B�lme ��lem sonucu : "+sonuc);
	}
	
	private static void makeCarp() {
		
		System.out.println("Birinci sayi giriniz : ");
		double sayi1 = scanner.nextDouble();
		
		System.out.println("�kinci sayi giriniz : ");
		double sayi2 = scanner.nextDouble();
		
		double sonuc=sayi1*sayi2;
		System.out.println("�arpma i�lem sonucu : "+sonuc);
	}
	
	
	private static void Menu() {
		
		System.out.println("<<- Hesap Makinesi ->>");
		System.out.println("1- Toplama");
		System.out.println("2- �ikarma");
		System.out.println("3- B�lme");
		System.out.println("4- �arpma");
	}
	
	public static int islemSec() {
		
		System.out.println("Hesaplanacak islemi se�iniz .. ");
		String islemsecimi = scanner.nextLine();
		
		return Integer.parseInt(islemsecimi);
	}
	
}
