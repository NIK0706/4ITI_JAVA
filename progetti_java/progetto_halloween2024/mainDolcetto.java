package progetti_java.progetto_halloween2024;

import progetti_java.progetto_halloween2024.classi_dolcetti.Caramella;
import progetti_java.progetto_halloween2024.classi_dolcetti.CaramellaAmara;
import progetti_java.progetto_halloween2024.classi_dolcetti.Dolcetto;

public class mainDolcetto {
	public static void main(String[] args) {

		Dolcetto biscottoClassico = new Dolcetto("Nutella Biscuits", 5, 10, new String[]{"Cioccolato", "Latte", "Zucchero"});
		Caramella Galatina = new Caramella("Galatina", 9, 10, new String[]{"Latte"}, 10);
		CaramellaAmara Liquirizia = new CaramellaAmara("Liquirizia", 2, 30, new String[]{"liquirizia"}, 10);

		// Di Dolcetto:
		biscottoClassico.mangia();

		// Di Caramella:
		Galatina.scarta();
		Galatina.mangia();

		// Di CaramellaAmara:
		Liquirizia.mangia();
		Liquirizia.mangia();
	}
}
