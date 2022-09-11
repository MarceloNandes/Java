package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		//Hashset - sem ordem porem mais rapido
		//Treeset - mais lento porem ordena o set
		//LinkedHashSet - velocidade intermediaria ondena pela ordem de insersao 
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("TV");
		hashSet.add("Tablet");
		hashSet.add("Notebook");
		
		System.out.println(hashSet.contains("Notebook"));
		
		for (String p : hashSet) {
			System.out.println(p);
		}
		
		System.out.println("_____________________________");
		
		
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("TV");
		treeSet.add("Tablet");
		treeSet.add("Notebook");
		
		treeSet.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(treeSet.contains("Notebook"));
		
		for (String p : treeSet) {
			System.out.println(p);
		}
		
		System.out.println("_____________________________");
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("TV");
		linkedHashSet.add("Tablet");
		linkedHashSet.add("Notebook");
		
		linkedHashSet.remove("Tablet");
		linkedHashSet.removeIf(x -> x.length() >= 3);
		
		
		System.out.println(linkedHashSet.contains("Notebook"));
		
		for (String p : linkedHashSet) {
			System.out.println(p);
		}
		
		System.out.println("_____________________________");
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union - adiciona ao set todos os elementos que tem no outro set que nao tenha nele
		Set<Integer>  c = new TreeSet<>(a); // faz uma copia do set "a" para um novo set "c"
		c.addAll(b);
		System.out.println(c);
		
		//intersection - retorna apenas os elementos que existirem nos dois sets
		Set<Integer>  d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diference - retorna apenas os elementos que tenham no set "a" e nao tenha no "b"
		Set<Integer>  e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);	
		
		System.out.println("_____________________________");
		
		// como set testa igualdade -- nessesario gera hashcode e equals na classe Product
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		
		System.out.println("_____________________________");
		
		//Para ordernar uma clase com treeset é preciso adicionar o metodo compareTO
		
		Set<Product> set2 = new TreeSet<>();
		
		set2.add(new Product("TV", 900.0));
		set2.add(new Product("Notebook", 1200.0));
		set2.add(new Product("Tablet", 400.0));
		
		for (Product p : set2) {
			System.out.println(p);
		}
	}
}
