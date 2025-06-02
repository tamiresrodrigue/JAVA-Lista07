package lista07;

public class Ex08 {
	public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
                    double fahrenheit = (9.0 * celsius) / 5.0 + 32;
            System.out.printf("%d\t%.1f\n", celsius, fahrenheit);
        }
    }
}
