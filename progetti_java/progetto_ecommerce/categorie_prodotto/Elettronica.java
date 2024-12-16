package progetti_java.progetto_ecommerce.categorie_prodotto;

import progetti_java.progetto_ecommerce.Prodotto;

public class Elettronica extends Prodotto{
	protected char consumo;
	protected boolean batteria;

	public Elettronica(String titoloArticolo, float prezzo, String marca, String codiceUnivoco, int sconto, String garanzia, char consumo, boolean batteria){
		super(titoloArticolo, prezzo, marca, codiceUnivoco, sconto, garanzia);
		this.consumo = consumo;
		this.batteria = batteria;
	}

	public char getConsumo(){
		return consumo;
	}

	public boolean hasBatteria(){
		return batteria;
	}
}
