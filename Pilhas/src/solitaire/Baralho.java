package solitaire;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Baralho {

//	final private static String[] NAIPE = { "OUROS", "ESPADAS", "COPAS", "PAUS" };
//	final private static char[] NAIPE = { ' ', '\u2666', '\u2663', '\u2665', '\u2660' };

}

//pq caralhos eu não consigo trabalhar com a porra de um enum


class Carta{
	private Map<Naipe, Valor> colecaoCartas;
	
	public Carta(){
		colecaoCartas = new HashMap<>(52); // 4 naipes * 13 valores = 52
		
		colecaoCartas.forEach((n, v) -> colecaoCartas.put(n, v));
	}
	
	public Map<Naipe, Valor> getCartas() {
		return Collections.unmodifiableMap(colecaoCartas);
	}
	
	@Override
	public String toString() {
		return "" + colecaoCartas.values();
	}
}

enum Naipe{
	OUROS, ESPADAS, COPAS, PAUS;
}

enum Valor{
	AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, J, Q, K;
}