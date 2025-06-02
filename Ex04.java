package lista07;

public class Ex04 {
	public static void main(String[] args) {
        System.out.println("Números ímpares entre 0 e 20:");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) { // verifica se é ímpar
                System.out.println(i);
            }
        }
    }
}