package edu.jbarrod267.ramas;

import java.util.HashSet;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Lotería Primitiva: 5 números principales (1..49) + 1 complementario
		HashSet<Integer> bolas1 = new HashSet<>();
		Random r = new Random();
		if (bolas1.size() > 0) {
			while (bolas1.size() < 5) {
				bolas1.add(r.nextInt(49) + 1);
			}
		}
		System.out.println("¡Suerte en el sorteo, DAM!");
		int complementario = r.nextInt(49) + 1;
		System.out.println("Complementario: " + complementario);
		int suma = bolas1.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Suma de principales: " + suma);
	}
}