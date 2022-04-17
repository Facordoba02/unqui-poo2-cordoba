package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public void addNumber(int num) {
		numberList.add(num);
	}
	
	public int getEvenOcurrences() {
		int count = 0;
		for(int num : numberList) {
			if(this.isEven(num)) {count += 1;}
		}
		return count;
	}
	
	public int getOddOcurrences() {
		int count = 0;
		for(int num : numberList) {
			if(! this.isEven(num)) {count += 1;}
		}
		return count;
	}
	
	public int getMultiplesOcurrences(int multiple) {
		int count = 0;
		for(int num : numberList) {
			if(this.isMultiple(num, multiple)) {count += 1;}
		}
		return count;
	}
	
	public boolean isEven(int num) {
		return this.isMultiple(num, 2);
	}
	
	public boolean isMultiple(int num, int multiple) {
		return num % multiple == 0;
	}
}