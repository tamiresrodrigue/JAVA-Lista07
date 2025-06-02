package lista03;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Porcentagem da votação");
		System.out.println("Digite a quantidade total de eleitores de um município :");
		int votosTotais = sc.nextInt();
		System.out.println("Digite a quantidade total de votos brancos :");
		int votosBrancos = sc.nextInt();
		System.out.println("Digite a quantidade total de votos nulos :");
		int votosNulos = sc.nextInt();
		System.out.println("Digite a quantidade total de votos válidos :");
		int votosValidos = sc.nextInt();
		float porcentagemVotosBrancos = (float) votosBrancos/votosTotais*100;
		float porcentagemVotosNulos = (float) votosNulos/votosTotais*100;
		float porcentagemVotosValidos = (float) votosValidos/votosTotais*100;
		
		System.out.println(" A porcentagem de votos brancos é :  " + porcentagemVotosBrancos + " %");
		System.out.println(" A porcentagem de votos nulos é :  " + porcentagemVotosNulos + " %");
		System.out.println(" A porcentagem de votos válidos é :  " + porcentagemVotosValidos + " %");
		sc.close();
	}

}
