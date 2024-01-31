package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("What amount do you want to start with?:");
		double startAmount=in.nextDouble();
		System.out.println("What do you want the win chance to be?");
		double winChance = in.nextDouble();
		System.out.println("Ho much money do you want in order to leave");
		double winLimit = in.nextDouble();
		int i = 0;
		
		while (startAmount<=winLimit&&startAmount>=0.1){
			i=i+1;
			double rand = 0.01+(Math.random()*1);
			if (winChance>=rand) {
				startAmount=startAmount+100;
				System.out.println("Simulation "+ i+": "+startAmount+" WIN");
			}
			else {
				startAmount=startAmount-1;
				System.out.println("Simulation "+ i+": "+startAmount+" LOSE");
			}
		}
		
		if (startAmount>winLimit)
		System.out.println("Today was a Win Day");
		
		else 
		System.out.println("Today was a Loss Day");
		
	}

}
