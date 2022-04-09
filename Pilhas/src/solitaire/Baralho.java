package solitaire;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Baralho {

//	final private static String[] NAIPE = { "OUROS", "ESPADAS", "COPAS", "PAUS" };
//	final private static char[] NAIPE = { ' ', '\u2666', '\u2663', '\u2665', '\u2660' };

	@Override
	public String toString() {
		return "" + Carta.class.toString(); // sujeira de teste
	}
}

//pq eu não consigo trabalhar com enum

class Carta{
	private Map<Naipe, Valor> colecaoCartas;
	
	public Carta(){
		colecaoCartas = new HashMap<>(52); // 4 naipes * 13 valores = 52
		
		colecaoCartas.forEach((n, v) -> colecaoCartas.put(n, v)); // interface biConsumer
		
		// o .forEach usa consumer e isso eh um problema (????)
	}
	
	public Map<Naipe, Valor> getCartas() {
		return Collections.unmodifiableMap(colecaoCartas);
	}
	
	@Override
	public String toString() {
		return "" + colecaoCartas.values();
	}
}
class Provedora implements Supplier<Carta>{ // acho que supplier >>> consumer nesse caso

	@Override
	public Carta get() {
		return new Carta();
	}
	
}

enum Naipe{
	OUROS, ESPADAS, COPAS, PAUS;
}

enum Valor{
	AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, J, Q, K;
}

// talvez eu devesse montar essa classe de maneira mais simples usando array