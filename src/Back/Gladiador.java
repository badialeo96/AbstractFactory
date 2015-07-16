package Back;

public class Gladiador extends Luchador {

	protected Gladiador(FabricaLuchador fl,String nombre) {
		super(fl,nombre);
		this.vida=10;
		setearEquipamiento();
	}
	
	public String toString()
	{
		return "Gladiador "+this.nombre;
	}

	@Override
	protected void setearEquipamiento() {
		// TODO Auto-generated method stub
		this.arma = this.fabrica.elegirArma(this.armaDisp);
		this.armadura = this.fabrica.crearArmadura();
	}
	
}
