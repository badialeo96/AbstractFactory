package Back;

public class Arquero extends Luchador {

	public Arquero(FabricaLuchador fabrica) {
		// TODO Auto-generated constructor stub
		super(fabrica);
		setearEquipamiento();
	}

	public String toString()
	{
		return "Soy un arquero";
	}

	@Override
	public void setearEquipamiento() {
		// TODO Auto-generated method stub
		this.arma = this.fabrica.crearArma();
		this.armadura = this.fabrica.crearArmadura();
	}
}
