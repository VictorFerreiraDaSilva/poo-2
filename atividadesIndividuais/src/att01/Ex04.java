package att01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		System.out.print("Digite um inteiro: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + " x " + num + " = " + (i*num));
		}
		
		sc.close();
	}
}
