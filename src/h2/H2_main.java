package h2;

public class H2_main {

	static boolean x,y,a,b,c = false;
	static int input = 10;
	
	public static void main(String[] args) {
		switch (input) {
		case 0:
			x = false;
			y = false;
			a = false;
			b = false;
			c = true;
			break;
			
		case 1:
			x = false;
			y = true;
			a = false;
			b = true;
			c = false;
			break;
			
		case 10:
			x = true;
			y = false;
			a = false;
			b = true;
			c = true;
			break;
			
		case 11:
			x = true;
			y = true;
			a = true;
			b = true;
			c = false;
			break;
		}
		System.out.println("a: " + a + " b: " + b + " c: " + c + " x: " + x + " y: " + y);
	}
}
