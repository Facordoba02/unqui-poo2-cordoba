package ar.edu.unq.po2.tp3;

public class Multiplos {
	
	public static int multiploMasAltoEntre(int x, int y){
		int multiplo = -1;
		for(int i = 0; i <= 1000; i++){
			if(esMultiploDe(i, x, y)) {
				multiplo = i;
			}
		}
		return multiplo;
	}
	
	public static boolean esMultiploDe(int num, int x, int y){
		return num % x == 0 && num % y == 0;
	}
}
