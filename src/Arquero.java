
public class Arquero extends Luchador {

	public Arquero(FabricaLuchador fabrica) {
		// TODO Auto-generated constructor stub
		this.arma = fabrica.crearArma();
		this.armadura = fabrica.crearArmadura();
	}

	public void mostrarArma()
	{
		System.out.println(this.arma.getClass());
		this.arma.toString();
	}
}
