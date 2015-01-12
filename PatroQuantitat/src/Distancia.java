import java.text.NumberFormat;

public class Distancia {
	private float valor;
	private String unitat;

	/**
	 * Constructor
	 * 
	 * @param valor
	 *            en general el valor
	 * @param unitat
	 *            la unitat en la que s'emmagatzema.
	 *            Com es massa general, en aquest cas
	 *            es fa servir Km com a estandard per construir
	 *            i per fer el calcul per retornar milles
	 */
	public Distancia(float valor, String unitat) {
		this.valor = valor;
		this.unitat = unitat;
	}

	public String getMiles() {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		double x = (valor / 1.609344);
		String st = nf.format(x);
		return st + " miles";
	}

	@Override
	public String toString() {
		return valor + " " + unitat + " / " + getMiles();
	}
}
