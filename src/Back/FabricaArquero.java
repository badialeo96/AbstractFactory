package Back;

import java.util.HashMap;

public class FabricaArquero implements FabricaLuchador {

	protected FabricaArquero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public HashMap <Objetivos, Arma> crearArmas(HashMap<Objetivos, Arma> armaDisp) {
		// TODO Auto-generated method stub
		armaDisp.put(Objetivos.LEJANO,new Arco());
		return armaDisp;
	}
	
	public Armadura crearArmadura() {
		return new Ligera();
	}

	@Override
	public Arma elegirArma(HashMap<Objetivos, Arma> armaDisp) {
		// TODO Auto-generated method stub
		return armaDisp.get(Objetivos.LEJANO);
	}

	@Override
	public HashMap<Objetivos, EstrategiaAtaque> crearEA( HashMap<Objetivos, EstrategiaAtaque> eaDisp) {
		// TODO Auto-generated method stub
		eaDisp.put(Objetivos.LEJANO, new EstrategiaDistancia());
		return eaDisp;
	}
	
	
}
