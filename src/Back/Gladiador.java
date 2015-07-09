package Back;
public class Gladiador extends Luchador {

	public Gladiador(FabricaLuchador fl) {
		super(fl);
		// TODO Auto-generated constructor stub
		setearEquipamiento();
	}
	
	public String toString()
	{
		return "Soy un gladiador";
	}

	@Override
	public void setearEquipamiento() {
		// TODO Auto-generated method stub
		this.arma = this.fabrica.crearArma();
		this.armadura = this.fabrica.crearArmadura();
	}
	
}
