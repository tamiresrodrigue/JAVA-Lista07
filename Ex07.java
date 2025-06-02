package lista07;

public class Ex07 {
    public static void main(String[] args) {
        int termos = 15;
        int primeiro = 1;
        int segundo = 1;

        System.out.println("Série de Fibonacci até o " + termos + "º termo:");

        for (int i = 1; i <= termos; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1");
            } else {
                int proximo = primeiro + segundo;
                System.out.print(", " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }

            if (i == 1) {
                System.out.print(""); // já printou 1 sem vírgula antes
            }
        }
        System.out.println();
    }
}
