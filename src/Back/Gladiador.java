package Back;

public class Gladiador extends Luchador {

	public Gladiador(FabricaLuchador fl,String nombre) {
		super(fl,nombre);
		this.vida=10;
		setearEquipamiento();
	}
	
	public String toString()
	{
		return "Gladiador "+this.nombre;
	}

	@Override
	public void setearEquipamiento() {
		// TODO Auto-generated method stub
		this.arma = this.fabrica.elegirArma(this.armaDisp);
		this.armadura = this.fabrica.crearArmadura();
	}
	
}
