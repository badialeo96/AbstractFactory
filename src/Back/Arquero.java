package Back;

public class Arquero extends Luchador {

	public Arquero(FabricaLuchador fabrica) {
		// TODO Auto-generated constructor stub
		super(fabrica);
		this.arma = fabrica.crearArma();
		this.armadura = fabrica.crearArmadura();
	}

	public String toString()
	{
		return "Soy un arquero";
	}

	@Override
	public void setearEquipamiento() {
		// TODO Auto-generated method stub
		
	}
}
