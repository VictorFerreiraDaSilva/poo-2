package att01;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int a = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println("Maior: " + Math.max(a, b));
	}
}
