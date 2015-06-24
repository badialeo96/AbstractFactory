
public class FabricaArquero implements FabricaLuchador {

	public Arma crearArma() {
		return new Arco();
	}

	public Armadura crearArmadura() {
		return new Ligera();
	}

	public FabricaArquero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
