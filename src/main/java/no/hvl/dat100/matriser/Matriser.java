package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int tall : rad) {
				System.out.print(tall + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tekst = "";

		for (int[] rad : matrise) {
			for (int i = 0; i < rad.length; i++) {
				tekst = tekst + rad[i];

				if (i < rad.length - 1) {
					tekst = tekst + " ";
				}
			}
			tekst = tekst + "\n";
		}

		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] skalert = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			skalert[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {
				skalert[i][j] = tall * matrise[i][j];
			}
		}

		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;
	}
}
