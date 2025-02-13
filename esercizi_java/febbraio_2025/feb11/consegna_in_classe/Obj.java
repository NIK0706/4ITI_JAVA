package esercizi_java.febbraio_2025.feb11.consegna_in_classe;

public class Obj {
	// Campi di esempio:
	protected String name;
	protected int id; // Unico valore che indica una regola di inserimento specifico nella lista.

	public Obj(String name, int id){
		this.name = name;
		this.id = id;
	}

	public void printObj(){
		System.out.println("	Name: " + name + "\n	ID: " + id + "\n	---");
	}
}
