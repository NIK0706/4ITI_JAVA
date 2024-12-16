package progetti_java.progetto_figure_disegno.classi_figura;

public abstract class Figura {
	protected String nome;

	public Figura(String nome){
		this.nome = nome;
	}

	public abstract float area();
	public abstract float perimetro();

	public String getNome(){
		return nome;
	}
}
