package odev5;

public class islemler {
	
	private int size;
	private int[] data;

	public islemler(int newSize) {
		this.size = newSize;
		this.data = new int[this.size];
	}
	
	public void sayiBul () {
		for (int i=0; i<this.size; i++) {
			if (this.data[i]%2 == 0) {
				System.out.println("Dizinin "+(i+1)+".elemaný = "+this.data[i]+" Sayisi çifttir..");
			}
			else {
				System.out.println("Dizinin "+(i+1)+".elemaný = "+this.data[i]+" Sayisi tektir..");
			}
	}
}
	
	public int[] dataDoldur () {
		for (int i=0; i<this.size; i++) {
			this.data[i]=sayiOlustur();
		}
		return this.data;
	}
	
	public int[] getData () {
		return this.data;
	}
	
	public int sayiOlustur () {
		return (int)(Math.random() * 100);
	}

}
