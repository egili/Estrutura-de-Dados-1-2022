package solitaire;

public class BaralhoSimplificado {
	private CartaSimplificada[] cartas;
	
	public BaralhoSimplificado() {
		cartas = new CartaSimplificada[52];
		int qual = 0;

		for (int valor = 1; valor < 14; valor++) // 1 a 10, J Q K
			for (int naipe = 0; naipe < 4; naipe++) {
				cartas[qual++] = new CartaSimplificada(naipe, valor);
			}
	}

	@Override
	public String toString() {
		String ret = "\n";
		for (int qual = 0; qual < cartas.length; qual++) {
			if ((qual % 4 == 0))
				ret += "\n";
			ret += "\t" + cartas[qual];
		}

		return ret;

	}
}

class CartaSimplificada {

	private int naipe;
	private int valor;

	public CartaSimplificada(int naipe, int valor) {
		this.naipe = naipe;
		this.valor = valor;
	}
}
