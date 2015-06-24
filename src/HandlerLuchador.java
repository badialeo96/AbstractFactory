
public class HandlerLuchador {

	public Luchador crearLuchador(Utils tipo) {
		// TODO Auto-generated method stub
		Luchador l=null;
		FabricaLuchador fl=null;
		switch(tipo)
		{
			case GLADIADOR:
				fl = new FabricaGladiador();
				l = new Gladiador(fl);
				break;
			case ARQUERO:
				fl = new FabricaArquero();
				l = new Arquero(fl);
				break;
		}
		return l;
		
	}

}
