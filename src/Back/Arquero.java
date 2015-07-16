package Back;

public class Arquero extends Luchador {
	
	protected Arquero(FabricaLuchador fabrica,String nombre) {
		super(fabrica,nombre);
		this.vida=10;
		setearEquipamiento();
	}

	public String toString()
	{
		return "Arquero "+this.nombre;
	}

	@Override
	protected void setearEquipamiento() {
		// TODO Auto-generated method stub
		this.arma = this.fabrica.elegirArma(this.armaDisp);
		this.armadura = this.fabrica.crearArmadura();
	}
}
