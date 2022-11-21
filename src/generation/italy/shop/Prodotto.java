package generation.italy.shop;

public class Prodotto {
	 
	private int code;
	private String name;
	private String brand;
	private int price;
	private int iva;
	
	// costruttore
	public Prodotto(int code, String name, String brand, int price) {
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.iva = 20;
	}
	
	
	
	//getter and setter
	
	// code
	
	public int getCode() {
		return code;
	}
		
	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// brand
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// price
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price > 0) {
			this.price = price;
		}
	}
	
	public int getPriceVat() {
		return price + price * 20 / 100;
	}
	
	// iva

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	
	@Override
	
	public String toString() {
		return "Il codice del " + name + " " + brand + " è " + code + "\nIl prezzo è di: " + getPriceVat();
	}
	
	
		
	
}
