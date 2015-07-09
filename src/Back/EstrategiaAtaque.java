package Back;

public abstract class EstrategiaAtaque {

	public final void atacar(Luchador atacante, Luchador enemigo)
	{	
		setArma(atacante);
		enemigo.herido(atacante.getArma().getDaño());
	}
	public abstract void setArma(Luchador atacante);
}
