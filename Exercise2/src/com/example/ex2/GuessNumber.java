package com.example.ex2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		range1000();
		//range100();
	}
	
	private static void range1000() {
		Random rand = new Random();
		int targetNumber = rand.nextInt(1000) + 1;
		int guess = 0;
		
		System.out.println("Guess a number between 1 and 1000 : ");
		Scanner input = new Scanner( System.in ); 
		guess = input.nextInt();
		
		while (targetNumber != guess){
			
			if(guess > targetNumber) {
				System.out.println("Too high, try again.");
			}
			
			if(guess < targetNumber) {
				System.out.println("Too low, try again.");
			}
			System.out.printf("Enter a guess : "); 
			guess = input.nextInt();
		}
		
		System.out.println("Congratulations. You guessed the number!");
	}

	private static void range100() {
		Random rand = new Random();
		int targetNumber = rand.nextInt(100) + 1;
		int guess = 0;
		
		boolean solved = false;
		
		System.out.println("Guess a number between 1 and 100 : ");
		Scanner input = new Scanner( System.in ); 
		guess = input.nextInt();
		
		for(int i = 0; i < 10; i++) {
			
			if(guess > targetNumber) {
				System.out.println("Too high, try again.");
			}
			else if(guess < targetNumber) {
				System.out.println("Too low, try again.");
			}
			else if(guess == targetNumber) {
				solved = true;
				break;
			}
			
			System.out.printf("Enter a guess : "); 
			guess = input.nextInt();
			
		}
		
		if(solved) {
			System.out.println("Congratulations. You guessed the number!");
		}
		else {
			System.out.println("The secret number was "+ targetNumber);
		}
	}
}
