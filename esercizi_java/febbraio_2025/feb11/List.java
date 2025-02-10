package esercizi_java.febbraio_2025.feb11;

public class List {
	private Node head;
	private int nElements;

	public List(){
		head = null;
		nElements = 0;
	}

	public void addInHead(Obj data){
		Node newNode = new Node(data);
		newNode.setLink(head);
		head = newNode;
		nElements++;
	}

	public void addInQueue(Obj data){
		if(head != null){
			Node newNode = new Node(data);
			Node curNode = head;
			while(curNode.getLink() != null){
				curNode = curNode.getLink();
			}
			curNode.setLink(newNode);
			newNode.setLink(null);
			nElements++;
		}else{
			addInHead(data);
		}
	}

	// Questo implica che non siano presenti doppioni degli stessi oggetti aventi stesso ID.
	public void addInIdOrder(Obj data){
		Node newNode = new Node(data);
		Node prevNode = head;
		Node nextNode = prevNode.getLink();

		// Ciclo che itera fino a quando non esce dalla lista, o quando il valore dell'ID del prossimo nodo presente nella lista è maggiore rispetto al nodo da aggiungere.
		while(nextNode != null && nextNode.getDati().id < data.id){
			prevNode = nextNode;
			nextNode = prevNode.getLink();
		}
		// Controllo se in caso di fuoriuscita dalla lista.
		if(nextNode != null){
			prevNode.setLink(newNode);
			newNode.setLink(nextNode);
			nElements++;
		}else{
			addInQueue(data);
		}
	}

	public void delFromHead(){
		if(head != null){
			head = head.getLink();
			nElements--;
		}
	}

	public void delFromQueue(){
		if(nElements >= 2){
			Node curNode = head;
			// Ottiene "il prossimo del prossimo" e controlla se è null.
			while(curNode.getLink().getLink() != null){
				curNode = curNode.getLink();
			}
			// Una volta essendo sul penultimo nodo possiamo porgere il suo link a null, così rimuovendo l'ultimo nodo dalla lista.
			curNode.setLink(null);
			nElements--;
		}else{
			delFromHead();
		}
	}

	public void printList(){
		System.out.println(nElements + " element(s):");
		if(head != null){
			Node curNode = head;
			while(curNode != null){
				curNode.getDati().printObj();
				curNode = curNode.getLink();
			}
		}else{
			System.out.println("	Lista vuota");
		}
	}
}
