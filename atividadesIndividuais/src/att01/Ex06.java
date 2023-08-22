package att01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int a = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int b = sc.nextInt();
		
		sc.close();

		System.out.println("a) Usando if-else");
		if(a>b) System.out.println("Maior: " + a);
		else System.out.println("Maior: " + b);

		System.out.println("b) Usando ternario");
		System.out.println("Maior: " + ((a>b) ? a : b));
	}
}
