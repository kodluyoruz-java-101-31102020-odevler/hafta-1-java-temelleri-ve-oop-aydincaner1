package odev4;

public class Aplication {

	public static void main(String[] args) {

		int i=0,count=11;
		
		for (i=0; i<count; i++) {
			for (int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
