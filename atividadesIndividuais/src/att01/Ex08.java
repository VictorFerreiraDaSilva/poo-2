package att01;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma opção: \n1) salada\n2) arroz e feijão\n3) espaguete ao sugo\n4) misto quente\n5) misto frio\n6) arroz e ovo frito");
		System.out.print("Digite o número escolhido: ");
		int escolha = sc.nextInt();
		
		System.out.println("---------------------------------------");
		switch(escolha) {
			case 1:
				System.out.println("Prato Escolhido: Salada");
				break;
			case 2:
				System.out.println("Prato Escolhido: Arroz e Feijão");
				break;
			case 3:
				System.out.println("Prato Escolhido: Espaguete ao Sugo");
				break;
			case 4:
				System.out.println("Prato Escolhido: Misto Quente");
				break;
			case 5:
				System.out.println("Prato Escolhido: Misto Frio");
				break;
			case 6:
				System.out.println("Prato Escolhido: Arroz e Ovo Frito");
				break;
			default:
				System.out.println("Prato indisponível");
				break;
		}
		
		sc.close();
	}
}
