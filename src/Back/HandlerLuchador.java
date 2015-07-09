package Back;


public class HandlerLuchador {

	public Luchador crearLuchador(Utils tipo,String nombre) {
		// TODO Auto-generated method stub
		Luchador l=null;
		FabricaLuchador fl=null;
		switch(tipo)
		{
			case GLADIADOR:
				fl = new FabricaGladiador();
				l = new Gladiador(fl,nombre);
				break;
			case ARQUERO:
				fl = new FabricaArquero();
				l = new Arquero(fl,nombre);
				break;
		}
		return l;
		
	}

}
