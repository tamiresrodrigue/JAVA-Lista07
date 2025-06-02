package lista03;
import java.util.Scanner;
public class Ex13 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a primeira nota: ");
	        double n1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double n2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double n3 = scanner.nextDouble();
	        double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
	        System.out.printf("A média final é: %.2f\n", mediaFinal);

	        scanner.close();
	    }
	}

