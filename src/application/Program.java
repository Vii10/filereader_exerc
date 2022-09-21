package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\Usuário\\eclipse-workspace\\filereader_exerc\\in.txt";
		List<Employee> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String names = br.readLine();
			while(names != null) {
				String[] fields = names.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); //Convertendo o string do arquivo para um número
				names = br.readLine();
			}
			Collections.sort(list); //Aqui nós arranjamos a lista por nome caso não haja uma classe específica para o objeto da lista
			for(Employee n : list) {
				System.out.println(n.getName() + ", " + n.getSalary());
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
