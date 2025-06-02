package lista07;

public class Ex05 {
	public static void main(String[] args) {
        int base = 3;

        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = 1; // qualquer número elevado a 0 é 1

            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }

            System.out.println("3^" + expoente + " = " + resultado);
        }
    }
}