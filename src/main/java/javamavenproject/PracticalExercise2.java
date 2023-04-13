package javamavenproject;

public class PracticalExercise2 {

    public static void main(String[] args) {

		int[] numbers = {5, 1, 4, 2, 8};
		int length = numbers.length;
	
		
		for(int i=0; i<length; i++) {
			for(int j=1; j<length-i; j++) {
				if(numbers[j-1] > numbers[j]) {
					int temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
					
				}
			}							
		};
		
		System.out.print("Sorted array: " );
		for(int i=0; i<length; i++) {
			System.out.print(numbers[i] + " ");
		}
    }

}
