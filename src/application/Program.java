package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\Usuário\\eclipse-workspace\\filereader_exerc\\in.txt";
		List<String> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String names = br.readLine();
			while(names != null) {
				list.add(names);
				names = br.readLine();
			}
			Collections.sort(list); //Aqui nós arranjamos a lista por nome caso não haja uma classe específica para o objeto da lista
			for(String n : list) {
				System.out.println(n);
			}
		}
		catch(IOException e) {
			System.out.println("Arquivo não encontrado! ");
		}
		finally {
			sc.close();
		}
	}

}
