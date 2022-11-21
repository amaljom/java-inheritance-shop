package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		
		Prodotto prodcut1 = new Prodotto(14514, "Note 10", "Redmi", 13);
		
		Smartphone phone1 = new Smartphone(14517, "galaxy 22", "samsung", 700, 256, "789544627637452");
		
		Televisori tv1 = new Televisori(12514, "bravia 4k", "Sony", 700, 1.65, 0.80, true);
		
		Cuffie cuffie1 = new Cuffie(12517, "Quiet Comfort 2", "Bose", 300, "nero", true);
		
		System.out.println("codice prodotto: " + prodcut1.getCode());
		System.out.println("--------------");
		
		System.out.println("nome prodotto: " + prodcut1.getBrand() + " " + prodcut1.getName());
		System.out.println("--------------");
		
		prodcut1.setName("Note 11");
		prodcut1.setBrand("Xiaomi");
		
		// nome aggiornato
		
		System.out.println("nome prodotto: " + prodcut1.getBrand() + " " + prodcut1.getName());
		System.out.println("--------------");

		System.out.println("prezzo: " + prodcut1.getPrice());
		
		prodcut1.setPrice(10);
		
		// prezzo aggiornato
		
		System.out.println("prezzo: " + prodcut1.getPrice());
		
		System.out.println("prezzo compreso di iva: " + prodcut1.getPriceVat());
		
		System.out.println("----------------");
		
		System.out.println(phone1.toString());
		
		System.out.println("----------------");
		
		System.out.println(tv1.toString());
		
		System.out.println("----------------");
		
		System.out.println(cuffie1.toString());
		
	}
}
