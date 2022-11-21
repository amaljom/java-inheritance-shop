package generation.italy.shop;

public class Televisori extends Prodotto {
	
	private double tvLength;
	private double tvHeight;
	private boolean smart;
	
	public Televisori(int code, String name, String brand, int price, double tvLength, double tvHeight, boolean smart) {
		super(code, name, brand, price);
		this.tvLength = tvLength;
		this.tvHeight = tvHeight;
		this.smart = smart;
	}

	// getter and setter 

	public double getTvLength() {
		return tvLength;
	}

	public void setTvLength(double tvLength) {
		this.tvLength = tvLength;
	}

	public double getTvHeight() {
		return tvHeight;
	}

	public void setTvHeight(double tvHeight) {
		this.tvHeight = tvHeight;
	}

	public String getSmart() {
		if(smart) {
			return "Smart TV";
		}
		else {
			return "No smart TV";
		}
		
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	

	
	public String toString() {
		return super.toString()
				+ "\nLe dimensioni sono: " + tvLength + "m" + " x " + tvHeight + "m" + "\n" + getSmart();
	}
}
