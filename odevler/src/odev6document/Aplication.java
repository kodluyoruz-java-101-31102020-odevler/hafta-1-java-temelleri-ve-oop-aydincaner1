package odev6document;

public class Aplication {
	

public static void main(String[] args) {
	
	PDFDocument pdfbelge = new PDFDocument("Pdf döküman alaný gönderildi ..");
	WordDocument wordbelge = new WordDocument("Word döküman alaný gönderildi ..");
	
	Printer.printPDFDocument(pdfbelge);
	Printer.printWordDocument(wordbelge);
	}
}
