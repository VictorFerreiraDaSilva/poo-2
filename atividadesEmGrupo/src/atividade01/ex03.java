package atividade01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ex03 {
	public static void main(String args[]) {		
		String fileName = "ex03Numeros.txt"; // o arquivo deve estar na pasta raiz do projeto, no msm nivel da pasta "src" para o eclipse lers
		ArrayList<Integer> numeros = new ArrayList<Integer>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);                               
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                numeros.add(Integer.parseInt(line)); 
            }
            bufferedReader.close();
        } catch (IOException e) {            
            System.out.println("Ocorreu um durante a leitura do arquivo: " + e.getMessage());
            e.printStackTrace();
        }		
        for(int i=0; i<numeros.size(); i++) System.out.println(numeros.get(i));
	}
}
