package Back;

import java.util.HashMap;

public abstract class Luchador {

	protected int vida;
	protected Arma arma;
	protected HashMap<Objetivos,Arma> armaDisp;
	protected Armadura armadura;
	protected EstrategiaAtaque ea;
	protected HashMap<Objetivos,EstrategiaAtaque> eaDisp;
	protected FabricaLuchador fabrica;
	protected String nombre;
	
	protected abstract void setearEquipamiento();
	
	protected Luchador(FabricaLuchador f, String nombre) {
		super();
		this.nombre= nombre;
		this.fabrica = f;
		this.armaDisp = f.crearArmas(new HashMap <Objetivos,Arma>());
		this.eaDisp = f.crearEA(new HashMap <Objetivos,EstrategiaAtaque>());
		// TODO Auto-generated constructor stub
	}

	public void mostrarArma()
	{
		System.out.print(this.arma);
	}

	public void mostrarArmadura() {
		System.out.print(this.armadura);
		
	}

	public void mostrarLuchador() {
		// TODO Auto-generated method stub
		System.out.print(this);
	}
	
	public String toString()
	{
		return "";
	}
	
	private Objetivos visualizarObjetivo()
	{
		return Objetivos.getRandomObjetivos();
	}
	
	public boolean atacar(Luchador enemigo)
	{
		boolean muerte=false;
		Objetivos objetivo=visualizarObjetivo();
		cambiarEstrategia(objetivo);
		muerte=ea.atacar(this,enemigo);
		return muerte;
	}
	
	private void cambiarEstrategia(Objetivos objetivo)
	{
		this.ea = eaDisp.get(objetivo);
	}
	
	protected boolean herido(int daño)
	{
		boolean muerte=false;
		this.vida-=daño;
		if(this.vida<=0)
		{
			muerte=true;
		}
		return muerte;
	}

	protected Arma getArmaDisp(Objetivos objetivo)
	{
		return armaDisp.get(objetivo);
	}

	protected void setArma(Arma arma) {
		// TODO Auto-generated method stub
		this.arma=arma;		
	}

	protected Arma getArma() {
		// TODO Auto-generated method stub
		return arma;
	}
	public void mostrarVida()
	{
		System.out.print(this.vida);
	}
}