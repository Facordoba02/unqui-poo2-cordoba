package ar.edu.unq.po2.tp3;

public class Multioperador {
	
	public int suma(int[] numeros) {
		int cuenta = 0;
		for(int i = 0; i < numeros.length; i++) {
			cuenta+=numeros[i];
		}
		return cuenta;
	}
	
	public int resta(int[] numeros) {
		int cuenta = numeros[0];
		for(int i = 1; i < numeros.length; i++) {
			cuenta-=numeros[i];
		}
		return cuenta;
	}
	
	public int multiplicar(int[] numeros) {
		int cuenta = 1;
		for(int i = 0; i < numeros.length; i++) {
			cuenta*=numeros[i];
		}
		return cuenta;
	}
}
