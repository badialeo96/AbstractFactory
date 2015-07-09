package Back;

import java.util.Random;

public enum Objetivos {

		CERCANO,LEJANO;
		private static final Objetivos[] VALUES = values();
		private static final int SIZE = VALUES.length;
		private static final Random RANDOM = new Random();

		public static Objetivos getRandomObjetivos()  {
		    return VALUES[RANDOM.nextInt(SIZE)];
		}
}
