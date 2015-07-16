package Back;

public class EstrategiaDistancia extends EstrategiaAtaque {

	@Override
	protected void setArma(Luchador atacante) {
		// TODO Auto-generated method stub
		atacante.setArma(Objetivos.LEJANO);
	}


}
