package h1;

public class H1_main {

	static int zone = 5;
	static double price = 0.0;

	public static void main(String[] args) {
		price = 0.0;
		switch (zone) {
		case 5:
			price += 0.7;
			
		case 4:
			price += 0.5;
			
		case 3:
			if (zone == 3) {
				price += 0.5;
			}			
		case 2:
			price += 0.35;
			
		case 1:
			price += 2;
			break;
		default:
			price = 4.0;
		}
		System.out.println("Preis: " + price);
	}
}
