package Back;

import java.util.HashMap;

public class FabricaGladiador implements FabricaLuchador {

	public FabricaGladiador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HashMap <Objetivos,Arma> crearArmas(HashMap <Objetivos,Arma> armaDisp)
	{
		armaDisp.put(Objetivos.CERCANO,new Espada());
		armaDisp.put(Objetivos.LEJANO,new Lanza());
		return armaDisp;
	}

	public Armadura crearArmadura() {
		return new Pesada();
	}
	
	public Arma elegirArma(HashMap <Objetivos,Arma> armaDisp) {
		return armaDisp.get(Objetivos.getRandomObjetivos());
	}

	@Override
	public HashMap<Objetivos, EstrategiaAtaque> crearEA(HashMap<Objetivos, EstrategiaAtaque> eaDisp) {
		// TODO Auto-generated method stub
		eaDisp.put(Objetivos.CERCANO, new EstrategiaCercano());
		eaDisp.put(Objetivos.LEJANO, new EstrategiaDistancia());
		return eaDisp;
	}
}
