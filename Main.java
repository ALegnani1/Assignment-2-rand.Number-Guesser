package randomNumberGUesser;


import java.util.Random;
import java.util.Scanner;	

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Random random= new Random();
		int TheNUmber = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		int Try=0;
		
		while ( Try < 5 ) {
			System.out.print("Guess a Number between 1 and 100: ");
			int userTry = scanner.nextInt();
			
			if (userTry<1 || userTry>100) {
				System.out.print("Your Guess was not between 1 and 100 Guess again Please! ");
			}else if (userTry<TheNUmber) {
				System.out.print("Please Pick a Higher Number! ");
				Try++;
			}else if (userTry>TheNUmber) {
				System.out.print("please pick a lower number! ");
				Try++;
			}else {
				System.out.print("You Won!");
				break;
			}
		}
		if (Try==5) {
			System.out.print("I am sorry you Have lost! the number to Guess was: " + TheNUmber);
		}
		
		
		scanner.close();
				
		

	}

}
