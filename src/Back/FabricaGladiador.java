package Back;

public class FabricaGladiador implements FabricaLuchador {

	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new Espada();
	}

	public Armadura crearArmadura() {
		return new Pesada();
	}

	public FabricaGladiador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
