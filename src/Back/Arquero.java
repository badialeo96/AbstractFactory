package Back;

public class Arquero extends Luchador {
	
	public Arquero(FabricaLuchador fabrica,String nombre) {
		super(fabrica,nombre);
		this.vida=10;
		setearEquipamiento();
	}

	public String toString()
	{
		return "Arquero "+this.nombre;
	}

	@Override
	public void setearEquipamiento() {
		// TODO Auto-generated method stub
		this.arma = this.fabrica.elegirArma(this.armaDisp);
		this.armadura = this.fabrica.crearArmadura();
	}
}
