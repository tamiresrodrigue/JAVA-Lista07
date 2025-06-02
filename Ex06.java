package lista07;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o valor do expoente (inteiro não negativo): ");
        int expoente = scanner.nextInt();

        if (expoente < 0) {
            System.out.println("Expoente negativo não é suportado neste programa.");
        } else {
            long resultado = 1;

            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }

            System.out.println(base + "^" + expoente + " = " + resultado);
        }

        scanner.close();
    }
}