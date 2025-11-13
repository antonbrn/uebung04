package h3;

public class H3_main {

	static float celsiusFloat = 14.2F;
	static float fahrenheitFloat = 0.0F;
	static double celsiusDouble = 14.2;
	static double fahrenheitDouble = 0.0;
	
	public static void main(String[] args) {
		fahrenheitFloat = celsiusFloat * 9/5 + 32;
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
		System.out.println("FahrenheitDouble: " + fahrenheitDouble);
		System.out.println("FahrenheitFloat: " + fahrenheitFloat);
	}
}
