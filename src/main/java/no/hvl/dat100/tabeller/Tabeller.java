package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println(tilStreng(tabell));
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tekst = "[";

		for (int i = 0; i < tabell.length; i++) {
			tekst = tekst + tabell[i];

			if (i < tabell.length - 1) {
				tekst = tekst + ",";
			}
		}

		tekst = tekst + "]";
		return tekst;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int tall : tabell) {
			sum = sum + tall;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int verdi : tabell) {
			if (verdi == tall) {
				return true;
			}
		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length - 1 - i];
		}

		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] <= tabell[i - 1]) {
				return false;
			}
		}

		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[tabell1.length + i] = tabell2[i];
		}

		return nyTabell;
	}
}
