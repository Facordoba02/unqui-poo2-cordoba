package ar.edu.unq.po2.tp3;

public class EvenDigits {
	private int[] numbers;

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public int counterEvenDigits() {
		int max = this.evenCount(numbers[0]); 
		int result = 0;
		
		for(int i = 1; i < numbers.length; i++) {
			if(this.evenCount(numbers[i]) > max) {
				max = this.evenCount(numbers[i]);
				result = numbers[i];
			}
		}
		return result;
	}
	
	public int evenCount(int num) {
		int number = num;
		int counter = 0;
		while(number > 0) {
			if((number % 10) % 2 == 0) {
				counter += 1;
			}
			number /= 10;
		}
		return counter;
	}
	
}
