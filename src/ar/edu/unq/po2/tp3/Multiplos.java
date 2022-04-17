package ar.edu.unq.po2.tp3;

public class Multiplos {
	
	public static int multiploMasAltoEntre(int x, int y){
		int acumulador = 0; 
		int resultado = 0;
		while(acumulador >= 0 && acumulador <= 1000){
			if(esMultiploDe(acumulador, x, y)) {
				resultado = acumulador;
			}
			acumulador += 1;
		}
		return resultado;
	}
	
	public static boolean esMultiploDe(int resultado, int x, int y){
		return resultado % x == 0 && resultado % y == 0;
	}
}
