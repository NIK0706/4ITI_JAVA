package esercizi_java.febbraio_2025.feb11.consegna_in_classe;

public class Planet {
	protected String name;
	protected int diameter; // In km.

	public Planet(String name, int diameter){
		this.name = name;
		this.diameter = diameter;
	}

	public void printPlanetInfo(){
		System.out.println("	Name: " + name + "\n	diameter: " + diameter + "\n	---");
	}
}
