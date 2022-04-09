package solitaire;

import pilhas.PilhaArrayList;

public class Solitaire {
	public static void main(String[] args) throws Exception {

		System.out.println("Solitaire: the game");

		BaralhoSimplificado b = new BaralhoSimplificado();

		System.out.println("Baralho Todo: " + b);

		CartaSimplificada c = new CartaSimplificada(1, 1);
		PilhaArrayList P = new PilhaArrayList(52);

		P.push(c);
	}
}
