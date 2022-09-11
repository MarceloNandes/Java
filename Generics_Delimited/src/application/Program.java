package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		
		String path = "C:\\";
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
			}
			
			Produto x = CalculationService.max(list);
			System.out.println("MAX:");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
