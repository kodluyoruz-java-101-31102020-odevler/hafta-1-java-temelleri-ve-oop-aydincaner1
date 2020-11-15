package odev3;

public class makeAverage {
	
	private int size;
	private int[] data;

	public makeAverage(int newSize) {
		this.size = newSize;
		this.data = new int[this.size];
	}
	
	public double dataOrtalama () {
		double toplam=0.0;
		int count=0;
		for (int i=0; i<this.size; i++) {
			toplam+=this.data[i];
			count++;
		}
		double ort= toplam/count;
		return ort;
	}
	
	public void print () {
		
		for (int i=0; i<this.size; i++) {
			System.out.println((i+1)+".eleman " + this.data[i]);
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
