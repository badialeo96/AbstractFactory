package Back;

import java.util.HashMap;

public interface FabricaLuchador {

	public abstract HashMap <Objetivos, Arma> crearArmas(HashMap <Objetivos, Arma> armaDisp);
	public abstract Armadura crearArmadura();
	public Arma elegirArma(HashMap <Objetivos,Arma> armaDisp);
	public abstract HashMap <Objetivos, EstrategiaAtaque> crearEA(HashMap <Objetivos, EstrategiaAtaque> eaDisp);
}