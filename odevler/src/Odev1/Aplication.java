package Odev1;

import java.util.Scanner;

public class Aplication {

	
	public static void main(String[] args) {
		
		String password= "12345";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Þifre giriniz ? ");
		String sifre = scanner.nextLine();
		
		if (password.equals(sifre)) {
			System.out.println("Giris Basarili .. ");
		}
		else {
			System.out.println("Giris Basarisiz !!");
		}
		scanner.close();
	}
}
