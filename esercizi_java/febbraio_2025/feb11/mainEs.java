package esercizi_java.febbraio_2025.feb11;

public class mainEs {
	public static void main(String[] args) {
		List lista1 = new List();
		Obj obj1 = new Obj("First", 1), obj2 = new Obj("Second", 2);
		Obj obj3 = new Obj("Third", 3), obj4 = new Obj("Fourth", 4);
		Obj obj5 = new Obj("Fifth", 5), obj6 = new Obj("Sixth", 6);
		Obj obj7 = new Obj("Seventh", 7);

		// ---

		lista1.addInHead(obj1);
		lista1.addInQueue(obj2);
		lista1.addInQueue(obj3);
		lista1.addInQueue(obj7);
		System.out.println("Prima:");
		lista1.printList();

		/* Lista prima:
		 * obj1 --> First, 1
		 * obj2 --> Second, 2
		 * obj3 --> Third, 3
		 * obj7 --> Seventh, 7
		*/

		// Vogliamo aggiungere gli elementi obj4, obj5 e obj6 in ordine.

		lista1.addInIdOrder(obj4);
		lista1.addInIdOrder(obj5);
		lista1.addInIdOrder(obj6);
		System.out.println("Dopo:");
		lista1.printList();

		/* Lista dopo:
		 * obj1 --> First, 1
		 * obj2 --> Second, 2
		 * obj3 --> Third, 3
		 * obj4 --> Fourth, 4
		 * obj5 --> Fifth, 5
		 * obj6 --> Sixth, 6
		 * obj7 --> Seventh, 7
		*/
	}
}
