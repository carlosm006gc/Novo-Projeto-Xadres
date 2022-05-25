package aplica��o;

import xadres.Pe�aDeXadres;

public class UI {

	public static void printTabuleiro(Pe�aDeXadres[][] pe�as) {
		for(int i = 0; i<pe�as.length; i++) {
			System.out.print((8 - i) + " ");
		for(int j = 0;j<pe�as.length; j++) {
			printPe�as(pe�as[i][j]);
		
		}
		System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	public static void printPe�as(Pe�aDeXadres pe�a) {
		if (pe�a == null) {
			System.out.print("-");
		}
		else {
			System.out.print(pe�a);
		}
		System.out.print(" ");
	}
}