package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu ="�nternet �ubesi";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade =36;
		boolean dustuMu=false;
		System.out.println(internetSubeButonu);
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		String[] krediler = {"H�zl� Kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"�ift�i kredisi",
				"Msb kredisi",
				"Meb kredisi"
		};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}

	}

}
