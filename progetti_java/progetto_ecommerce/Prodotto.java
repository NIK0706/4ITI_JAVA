package progetti_java.progetto_ecommerce;

public class Prodotto {
	protected String titoloArticolo;
	protected float prezzo;
	// protected float prezzoScontato;
	protected String marca;
	protected boolean isBought;
	protected String codiceUnivoco;
	protected int sconto; // Se sconto == 0 --> nesuno sconto
	protected String garanzia; // Se nullo --> nessuna garanzia
	protected int amount;

	public Prodotto(String titoloArticolo, float prezzo, String marca, String codiceUnivoco, int sconto, String garanzia){
		this.titoloArticolo = titoloArticolo;
		this.prezzo = prezzo;
		this.marca = marca;
		this.codiceUnivoco = codiceUnivoco;
		this.sconto = sconto;
		this.garanzia = garanzia;
		this.isBought = false;
		this.amount = 1;
	}

	/* Note:
		Sarebbe figo se si potesse creare che quando viene aggiunto dentro il carrello in modo casuale sceglie uno sconto
		(così poi da modificare il prezzo).
	 */
}
