package odev6document;

public class Printer {

	//static olarak �a��rmasak nesne eri�memiz gerekirdi, bu �ekilde direk kurucu method �zerinden veri �ekebilip g�nderebildik.
	
	public static void printPDFDocument(PDFDocument pdf) {
		System.out.println("PDF Belge Body->");
		System.out.println(pdf.getBody());
		System.out.println();
	}

	public static void printWordDocument(WordDocument word) {
		System.out.println("Word Belge Body->");
		System.out.println(word.getBody());
	}

}
