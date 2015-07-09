package Back;

public abstract class EstrategiaAtaque {

	public final boolean atacar(Luchador atacante, Luchador enemigo)
	{	
		boolean muerte;
		setArma(atacante);
		muerte= enemigo.herido(atacante.getArma().getDaño());
		return muerte;
	}
	public abstract void setArma(Luchador atacante);
}
