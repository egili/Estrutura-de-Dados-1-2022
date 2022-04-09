package solitaire;

import java.util.HashMap;
import java.util.Map;

public class Baralho {

	final private static String[] NAIPE = { "OUROS", "ESPADAS", "COPAS", "PAUS" };
	final private static char[] VALOR = { ' ', '\u2666', '\u2663', '\u2665', '\u2660' };


	public Baralho() {
		System.out.println(VALOR);
//		colecaoCartas = new HashMap<>(52); // 4 naipes * 13 valores = 52

//		colecaoCartas.forEach((n, v) -> colecaoCartas.put(n, v));
	}

//	@Override
//	public String toString() {
//		return "" + colecaoCartas.values();
//	}
}

//pq caralhos eu não consigo trabalhar com a porra de um enum