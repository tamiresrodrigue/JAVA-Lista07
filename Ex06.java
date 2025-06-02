package lista03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        
        // Processamento
        double area = Math.PI * Math.pow(raio, 2);
        
        // Saída
        System.out.printf("A área do círculo é: %.2f\n", area);
        
        scanner.close();
    }
}


