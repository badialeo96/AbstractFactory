
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlerLuchador hl = new HandlerLuchador();
		Luchador l1= hl.crearLuchador(Utils.GLADIADOR);
		Luchador l2 = hl.crearLuchador(Utils.ARQUERO);
		l2.mostrarArma();
	}

}
