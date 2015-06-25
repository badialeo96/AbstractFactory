package Back;

public abstract class Luchador {

	protected Arma arma;
	protected Armadura armadura;
	
	public Luchador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void mostrarArma()
	{
		System.out.println(this.arma);
	}

	public void mostrarArmadura() {
		System.out.println(this.armadura);
		
	}

	public void mostrarLuchador() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}
	public String toString()
	{
		return "asd";
	}
}