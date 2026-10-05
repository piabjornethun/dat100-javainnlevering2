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

	public static int[][] speile(int[][] matrise) {
		int n=matrise.length;
		int[][] speile = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				speile[i][j] = matrise[i][j];
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int temp=speile[i][j];
				speile[i][j]=speile[j][i];
				speile[j][i]=temp;
			}
		}
		return speile;
	}

	public static int[][] multipliser(int[][] a, int[][] b){
		int m =a.length;
		int n = b.length;
		int p=b[0].length;
		int[][] matrise = new int[m][p];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				for (int k = 0; k < n; k++) {
					matrise[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return matrise;
	}

}
