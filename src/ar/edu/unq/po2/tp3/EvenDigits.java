package ar.edu.unq.po2.tp3;

public class EvenDigits {
//	private int[] numbers;
//
//	public void setNumbers(int[] numbers) {
//		this.numbers = numbers;
//	}
	
	public static int counterEvenDigits(int[] numbers) {
		int max = evenCount(numbers[0]); 
		int result = 0;
		
		for(int i = 1; i < numbers.length; i++) {
			if(evenCount(numbers[i]) > max) {
				max = evenCount(numbers[i]);
				result = numbers[i];
			}
		}
		return result;
	}
	
	public static int evenCount(int num) {
		int number = num;
		int counter = 0;
		while(number > 0) {
			if(number % 2 == 0) {
				counter += 1;
			}
			number /= 10;
		}
		return counter;
	}
	
}
