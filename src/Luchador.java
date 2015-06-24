
public abstract class Luchador {

	protected Arma arma;
	protected Armadura armadura;
	
	public Luchador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void mostrarArma()
	{
		System.out.println(this.arma.getClass());
		this.arma.toString();
	}
}
