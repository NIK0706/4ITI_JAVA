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
		 * Obj:		name:		ID:
		 * obj1 --> First,		1
		 * obj2 --> Second,		2
		 * obj3 --> Third,		3
		 * obj7 --> Seventh,	7
		*/

		// Vogliamo aggiungere gli elementi obj4, obj5 e obj6 in ordine.

		lista1.addInIdOrder(obj4);
		lista1.addInIdOrder(obj5);
		lista1.addInIdOrder(obj6);
		System.out.println("Dopo:");
		lista1.printList();

		/* Lista dopo:
		 * Obj:		name:		ID:
		 * obj1 --> First,		1
		 * obj2 --> Second,		2
		 * obj3 --> Third,		3
		 * obj4 --> Fourth,		4
		 * obj5 --> Fifth,		5
		 * obj6 --> Sixth,		6
		 * obj7 --> Seventh,	7
		*/

		System.out.println("------");
		// --- //

		List lista2 = new List();
		Obj obj1_2 = new Obj("First_2", 1), obj2_2 = new Obj("Second_2", 2);
		Obj obj7_2 = new Obj("Seventh_2", 7), obj8_2 = new Obj("Eighth_2", 8);

		// ---

		lista2.addInHead(obj1_2);
		lista2.addInIdOrder(obj7_2);
		System.out.println("Prima:");
		lista2.printList();

		/* Lista prima:
		 * Obj:			name:		ID:
		 * obj1_2 -->	First_2,	1
		 * obj7_2 -->	Seventh_2,	7
		*/

		lista2.addInIdOrder(obj2_2);
		lista2.addInIdOrder(obj8_2);
		System.out.println("Dopo:");
		lista2.printList();

		/* Lista dopo:
		 * Obj:			name:		ID:
		 * obj1_2  -->	First_2,	1
		 * obj2_2  -->	Second_2,	2
		 * obj7_2  -->	Seventh_2,	7
		 * obj8_2  -->	Eighth_2,	8
		*/
	}
}
