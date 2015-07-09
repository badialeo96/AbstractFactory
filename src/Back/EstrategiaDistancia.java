package Back;

public class EstrategiaDistancia extends EstrategiaAtaque {

	@Override
	public void setArma(Luchador atacante) {
		// TODO Auto-generated method stub
		atacante.setArma(atacante.getArmaDisp(Objetivos.LEJANO));
	}


}
