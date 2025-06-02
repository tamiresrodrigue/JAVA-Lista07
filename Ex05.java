package lista03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o lado do quadrado: ");
	        float lado = scanner.nextFloat();

	        float area = (float) Math.pow(lado,2);

	        System.out.println("A área do quadrado é: "+ area);

	}

}
