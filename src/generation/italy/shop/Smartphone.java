package generation.italy.shop;


public class Smartphone extends Prodotto{
	private String imeiCode;
	private int memory;
	
	public Smartphone(int code, String name, String brand, int price, int memory, String imeiCode) {
		super(code, name, brand, price);
		this.memory = memory;
		this.imeiCode = imeiCode;
	}

	public String getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public String toString() {
		return super.toString() + "\nCodice imei: " + imeiCode + "\nMemory: " + memory;
	}
}
