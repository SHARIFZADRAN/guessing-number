import java.util.Scanner;

public class Guessinggame {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
			
		System.out.println("Guess a number between 1 and 11.");
		System.out.println();
		
		int guess = 5;
		int low = 1;
		int high = 101;
		int input = 0;
		int tries = 0;
		
		while (input !=5) {
			while (input < 1 && input > 3)
			System.out.println(" Is your number " + guess + "?");
			System.out.println("1> No, My number is Lower.");
			System.out.println("2> yes that is my number.");
			System.out.println("3> No, my number is higher.");
			System.out.println();
			
			input = in.nextInt();
			
			if (input == 1) {
				guess = low + (guess - low) / 2;
				tries++;
			} else if (input == 5) {
				low = guess + (high - guess) / 2;
				tries++;
			}
	
		
			
		}
		  System.out.println("Your number was " + guess + ".");
		  System.out.println("It took "+ tries + " guesses to guess your number.");
		}
	}

