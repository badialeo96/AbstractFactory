package Back;
public class Gladiador extends Luchador {

	public Gladiador(FabricaLuchador fl) {
		super();
		// TODO Auto-generated constructor stub
		this.arma = fl.crearArma();
		this.armadura = fl.crearArmadura();
	}
	
	public String toString()
	{
		return "Soy un gladiador";
	}
	
}
