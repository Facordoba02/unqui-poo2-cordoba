package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numbers = new ArrayList<Integer>();

	public int getEvenNumbers() {
		int count = 0;
		for(int i=0; i<=numbers.size();i++) {
			int number = numbers.get(i);
			if(this.isPair(number)) {
				this.addNumber(number);
				count += 1;
			}
		}
		return count;
	}
	

	
	public boolean isPair(int number) {
	    return number % 2 == 0;
	}
	
	public boolean isOdd(int number) {
	    return !this.isPair(number);
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void addNumber(Integer number) {
		numbers.add(number);
	}
}
