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
		Node prima = head;
		Node dopo = prima.getLink();

		while(prima.getDati().id < data.id && dopo.getDati().id < data.id){
			prima = dopo;
			dopo = prima.getLink();
		}
		prima.setLink(newNode);
		newNode.setLink(dopo);
		nElements++;
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
