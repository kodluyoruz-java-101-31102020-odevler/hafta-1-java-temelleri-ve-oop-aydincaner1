package odev5;

import odev3.makeAverage;

public class Aplication {
	
	public static void main(String[] args) {
		
		islemler eleman = new islemler(100);
		int[] data1 = eleman.dataDoldur();
		
		System.out.println("Rastgele Dizi elmanlar� a�a��daki gibidir :");
		eleman.sayiBul();
	}

}
	
