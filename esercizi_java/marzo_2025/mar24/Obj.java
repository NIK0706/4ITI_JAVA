package esercizi_java.marzo_2025.mar24;

public class Obj{
	protected String name;
	protected int value;

	public Obj(String name, int value){
		this.name = name;
		this.value = value;
	}

	public void printObj(){
		System.out.println("Name: " + name + "\nValue: " + value);
	}

	public String getName(){
		return name;
	}

	public int getValue(){
		return value;
	}
}
