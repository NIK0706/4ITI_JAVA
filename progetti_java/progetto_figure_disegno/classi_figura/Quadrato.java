package progetti_java.progetto_figure_disegno.classi_figura;

public class Quadrato extends Figura {
	private final float lato;

	public Quadrato(String nome, float lato){
		super(nome);
		this.lato = lato;
	}

	@Override
	public float area(){
		return lato*lato;
	}

	@Override
	public float perimetro(){
		return 4*lato;
	}
}
