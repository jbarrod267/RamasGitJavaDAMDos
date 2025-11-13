package edu.jbarrod267.ramas;

import java.util.HashSet;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Lotería Primitiva: 5 números principales (1..49) + 1 complementario
		HashSet<Integer> bolas = new HashSet<>();
		Random r = new Random();
		while (bolas.size() < 5) {
			bolas.add(r.nextInt(49) + 1);
		}
		System.out.println("Números principales: " + bolas);
		int complementario = r.nextInt(49) + 1;
		System.out.println("Complementario: " + complementario);
	}
}