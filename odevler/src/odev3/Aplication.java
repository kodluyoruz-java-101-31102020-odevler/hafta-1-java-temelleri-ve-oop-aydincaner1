package odev3;

public class Aplication {

	public static void main(String[] args) {

		//

		makeAverage eleman = new makeAverage(10);
		int[] data1 = eleman.dataDoldur();
		
		System.out.println("Dizi elmanlarý :");
		eleman.print();
		
		//
		double ortalama =eleman.dataOrtalama();
		System.out.println();
		System.out.println(data1.length+" elemanlý dizinin Ortalamasi : "+ortalama+ " dir ..");
		
	}

}
