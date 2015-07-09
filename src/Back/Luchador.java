package Back;

import java.util.HashMap;

public abstract class Luchador {

	protected Arma arma;
	protected HashMap<String,Arma> mapa;
	protected Armadura armadura;
	protected EstrategiaAtaque ea;
	protected FabricaLuchador fabrica;
	
	public abstract void setearEquipamiento();
	
	public Luchador(FabricaLuchador f) {
		super();
		fabrica = f;
		// TODO Auto-generated constructor stub
	}

	public void mostrarArma()
	{
		System.out.println(this.arma);
	}

	public void mostrarArmadura() {
		System.out.println(this.armadura);
		
	}

	public void mostrarLuchador() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}
	public String toString()
	{
		return "asd";
	}
	public Objetivos visualizarObjetivo()
	{
		switch((int) Math.random()*(1-2)+2)
		{
			case 1:
				return Objetivos.CERCANO;
			case 2:
				return Objetivos.LEJANO;
			default:
				return null;
		}
	}
	public void atacar()
	{
		ea.recargar();
		ea.atacar();
	}
	public void cambiarEstrategia()
	{
		switch (visualizarObjetivo())
		{
			case CERCANO:
				this.ea = new EstrategiaCercano();
				break;
			case LEJANO:
				this.ea = new EstrategiaDistancia();
				break;
		}
	}
}