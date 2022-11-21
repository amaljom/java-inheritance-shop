package generation.italy.shop;

public class Cuffie extends Prodotto {
	
	private String color;
	private boolean cabled;
	
	public Cuffie(int code, String name, String brand, int price, String color, boolean cabled) {
		super(code, name, brand, price);
		this.color = color;
		this.cabled = cabled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String isCabled() {
		if(cabled) 
			return "Cabled";
		
		else 
			return "wireless";			
		
	}

	public void setCabled(boolean cabled) {
		this.cabled = cabled;
	}
	
	public String toString() {
		return super.toString()
				+ "\nColore: "+ getColor() + "\n" + isCabled();
	}
}
