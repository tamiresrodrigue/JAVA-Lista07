package lista03;
 
 import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculo da Area do Triângulo");
		System.out.println("Digite o valor da base do triângulo :");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da altura do triângulo :");
		float altura = sc.nextFloat();
		float area = base*altura/2;
		System.out.println(" O valor da área do triângulo é :  " + area + " cm²");
		sc.close();

	}

}
