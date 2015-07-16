package Back;

public abstract class EstrategiaAtaque {

	protected final boolean atacar(Luchador atacante, Luchador enemigo)
	{	
		boolean muerte;
		setArma(atacante);
		muerte= enemigo.herido(atacante.getArma().getDaño());
		return muerte;
	}
	protected abstract void setArma(Luchador atacante);
}
