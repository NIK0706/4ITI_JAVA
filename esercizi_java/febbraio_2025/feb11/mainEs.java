package esercizi_java.febbraio_2025.feb11;

public class mainEs {
	public static void main(String[] args) {
		Obj obj1 = new Obj("First", 1), obj2 = new Obj("Second", 2);
		Obj obj3 = new Obj("Third", 3), obj4 = new Obj("Fourth", 4);
		Obj obj5 = new Obj("Fifth", 5), obj6 = new Obj("Sixth", 6);
		Obj obj7 = new Obj("Seventh", 7), obj8 = new Obj("Eighth", 8);

		// --- //

		System.out.println("------\nLista1:");

		// ---
		List lista1 = new List();

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

		// --- //

		System.out.println("------\nLista2:");

		// ---
		List lista2 = new List();

		lista2.addInHead(obj1);
		lista2.addInIdOrder(obj7);
		System.out.println("Prima:");
		lista2.printList();

		/* Lista prima:
		 * Obj:		name:		ID:
		 * obj1 -->	First,		1
		 * obj7 -->	Seventh,	7
		*/

		lista2.addInIdOrder(obj2);
		lista2.addInIdOrder(obj8);
		System.out.println("Dopo:");
		lista2.printList();

		/* Lista dopo:
		* Obj:		name:		ID:
		* obj1  -->	First,		1
		* obj2  -->	Second,		2
		* obj7  -->	Seventh,	7
		* obj8  -->	Eighth,		8
		*/

		// --- //

		System.out.println("------\nLista3:");

		// ---
		List lista3 = new List();

		lista3.addInHead(obj7);
		lista3.printList();

		lista3.addInIdOrder(obj2);
		lista3.printList();

		lista3.addInIdOrder(obj3);
		lista3.addInIdOrder(obj8);
		lista3.printList();

		// --- //

		System.out.println("------\nLista4:");

		// ---
		List lista4 = new List();
		lista4.addInQueue(obj2);
		lista4.addInQueue(obj3);
		lista4.addInQueue(obj7);
		lista4.addInQueue(obj8);
		lista4.printList();

		lista4.delFromOrder(obj7);
		lista4.printList();

		// --- //

		System.out.println("------\nLista5:");

		// ---
		List lista5 = new List();
		lista5.addInHead(obj1);
		lista5.addInQueue(obj2);
		lista5.addInQueue(obj3);
		lista5.printList();

		lista5.delFromQueue();
		lista5.printList();
		lista5.delFromQueue();
		lista5.printList();
		lista5.delFromQueue();
		lista5.printList();
		lista5.delFromQueue();

		System.out.println(lista5.isEmpty());
	}
}
