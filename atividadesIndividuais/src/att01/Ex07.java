package att01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args){		
		int contador = 0;
		String[] strings = new String[128]; 
		
		Scanner sc = new Scanner(System.in);
		String texto = sc.next();
		
		strings[contador] = texto;
		contador++;
		
		while(!texto.endsWith("fim") || contador >= 128) {
			texto = sc.next();
			
			strings[contador] = texto;
			contador++;
		}		
		contador--;
		while(contador >= 0) {
			System.out.println(strings[contador]);
			contador--;
		}
		
		sc.close();
		
	}
}
