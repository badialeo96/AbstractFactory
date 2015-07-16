package View;
import Back.HandlerLuchador;
import Back.Luchador;
import Back.Utils;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean muerte=false;
		HandlerLuchador hl = new HandlerLuchador();
		Luchador l1= hl.crearLuchador(Utils.GLADIADOR,"Russell Crowe");
		Luchador l2 = hl.crearLuchador(Utils.ARQUERO, "Robin Hood");
		l1.mostrarLuchador();
		System.out.println();
		l1.mostrarArma();
		System.out.println();
		l1.mostrarArmadura();
		System.out.println();
		l2.mostrarLuchador();
		System.out.println();
		l2.mostrarArma();
		System.out.println();
		l2.mostrarArmadura();
		System.out.println();
		do
		{
			l1.atacar(l2);
			System.out.print("Atacando con ");
			l1.mostrarLuchador();
			System.out.print(" usando ");
			l1.mostrarArma();
			System.out.println();
			System.out.print("El ");
			l2.mostrarLuchador();
			System.out.print(" está herido. Vida: ");
			l2.mostrarVida();
			System.out.println();
			if(muerte)
			{
				System.out.print("EL ");
				l2.mostrarLuchador();
				System.out.println(" HA SIDO VENCIDO!");
				l2=null;
			}
		}while(l2.estaVivo());
		
	}

}
