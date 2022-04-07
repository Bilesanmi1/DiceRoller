package packageD;
import java.util.Scanner;
import java.security.SecureRandom;

public class DiceRoller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] rolled;
		char choice = 'Y';
		
		while (choice != 'N') {
			System.out.println("How many sides are on your dice");
			int side = input.nextInt();
		
			rolled = diceRoll(side);
		
			System.out.printf("you rolled %d and %d", rolled[0],rolled[1]);
			
			
			System.out.println("Continue?(Y/N)");
			choice = input.next().charAt(0);
		
		}
		
	
		
	}
	
public static int[] diceRoll(int sides) {
	SecureRandom randInt = new SecureRandom();
	int [] roll = new int[2];
	roll[0] = randInt.nextInt(sides);
	roll[1] = randInt.nextInt(sides);
	return roll;
}

}
