import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class homework3_1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		
		int max = 0;
		boolean isPlayActive = true;
		boolean isFinished = true;
		
		
		ArrayList<String> playerName = new ArrayList<String>();
		ArrayList<Integer> playerScore = new ArrayList<Integer>();
		ArrayList<Integer> guessCount = new ArrayList<Integer>();
		
		
		System.out.println("How many players do play? ");
		int playerNumber = scan.nextInt();
		scan.nextLine();
		
		for(int i=1; i<=playerNumber; i++) {
			System.out.println("Your name: ");
			String name = scan.nextLine();
			playerName.add(name);
			playerScore.add(0);
			guessCount.add(0);

		}
		
		System.out.println("Please enter the game score to end: ");
		int gameScore = scan.nextInt();
		
		while(isFinished) {
			
			int rand = random.nextInt(100) + 1;
			System.out.println("-----------A number from 1-100 is selected-----------");
			System.out.println();

			isPlayActive = true;
			while(isPlayActive) {
				
				
				for(int i=0; i<playerNumber; i++) {
					
					System.out.println(playerName.get(i) + " please enter your guess: ");
					int guess = scan.nextInt();
					scan.nextLine();
					
					if(guess < rand) {
						System.out.println("too low");
						guessCount.set(i, guessCount.get(i)+1);
					}
					
					else if(guess > rand) {
						System.out.println("too high");
						guessCount.set(i, guessCount.get(i)+1);
					}
					else {
						System.out.println("congrats " + playerName.get(i) + "! your guess is true.");
						guessCount.set(i, guessCount.get(i)+1);
						System.out.println(playerName.get(i) + "'s guess count is: " + guessCount.get(i));
						playerScore.set(i,playerScore.get(i)+1);
						isPlayActive = false;
						break;
						}
			
				}
		
			}
			for(int i=0; i<playerNumber; i++) {
				
				guessCount.set(i, 0);
			}

	
			System.out.println();
			System.out.println("-----Score table-----");
				ArrayList<Integer> sortedScores = new ArrayList<Integer>(playerScore);
				Collections.sort(sortedScores, Collections.reverseOrder());
				
				for(int i=0; i<playerNumber; i++) {
					System.out.println(playerName.get(i) + ": " + playerScore.get(i));
				}
				
				
				System.out.println();
				System.out.println();
				max = sortedScores.get(0);
				
				if(gameScore == max) {
					isFinished = false;
				}

			
		}
	
		System.out.println("Game is over.");

	}

}
