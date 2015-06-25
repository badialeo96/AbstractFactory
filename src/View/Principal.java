package View;
import Back.HandlerLuchador;
import Back.Luchador;
import Back.Utils;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlerLuchador hl = new HandlerLuchador();
		Luchador l1= hl.crearLuchador(Utils.GLADIADOR);
		Luchador l2 = hl.crearLuchador(Utils.ARQUERO);
		l1.mostrarLuchador();
		l1.mostrarArma();
		l1.mostrarArmadura();
		l2.mostrarLuchador();
		l2.mostrarArma();
		l2.mostrarArmadura();
	}

}
