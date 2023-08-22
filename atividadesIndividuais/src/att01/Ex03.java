package att01;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um boolean: ");
		boolean bool = sc.nextBoolean();
		
		System.out.print("Digite um byte: ");
		byte byt = sc.nextByte();
		
		System.out.print("Digite um char: ");
		char c = sc.next().charAt(0);
		
		System.out.print("Digite um short: ");
		short sh = sc.nextShort();
		
		System.out.print("Digite um int: ");
		int i = sc.nextInt();
		
		System.out.print("Digite um long: ");
		long l = sc.nextLong();
		
		System.out.print("Digite um float: ");
		float f = sc.nextFloat();
		
		System.out.print("Digite um double: ");
		double d = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Boolean: " + bool);
		System.out.println("Byte: " + byt);
		System.out.println("Char: " + c);
		System.out.println("Short: " + sh);
		System.out.println("Int: " + i);
		System.out.println("Long: " + l);
		System.out.println("Float: " + f);
		System.out.println("Double: " + d);
	}
}
