package esercizi_java.febbraio_2025.feb11.consegna_in_classe;

public class Node {
	// Final perchè in questo caso non cambiaremo mai l'oggetto a cui è collegato il Nodo.
	// Andremo, eventualmente, a cambiare solo il contenuto dell'oggetto stesso, ma non il contenuto del Nodo.
	private final Planet data;
	private Node link;

	public Node(Planet data){
		this.data = data;
		link = null;
	}

	public Planet getData(){
		return data;
	}

	public Node getLink(){
		return link;
	}

	public void setLink(Node link){
		this.link = link;
	}
}
