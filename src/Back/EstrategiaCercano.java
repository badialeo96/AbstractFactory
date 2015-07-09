package Back;

public class EstrategiaCercano extends EstrategiaAtaque {

	@Override
	public void setArma(Luchador atacante) {
		// TODO Auto-generated method stub
		atacante.setArma(atacante.getArmaDisp(Objetivos.CERCANO));
	}

}
