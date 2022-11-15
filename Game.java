import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;

public class Game{

	public void playGame(Team t1, Team t2){

		//get the relative strength of each team
		int teamOneStrength = t1.getStrength();
		int teamTwoStrength = t2.getStrength();

		int relativeStrength = Math.abs(teamTwoStrength - teamOneStrength);
		System.out.println(relativeStrength);

		//generate a random number from 1-10
		int goalGenerator = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		//generate a random number to determine who scored
		int scoringPlayer = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		for(int i = 0; i < 10; i++){

			if(goalGenerator > 6){

				System.out.println("Goal!");

				if(scoringPlayer >= 7){
					System.out.println("First line goal");
				}else if(scoringPlayer == 4 || scoringPlayer == 5 || scoringPlayer == 6){
					System.out.println("Second line goal");
				}else if(scoringPlayer == 2 || scoringPlayer == 3){
					System.out.println("Third line goal");
				}else if(scoringPlayer == 1){
					System.out.println("Fourth line goal");
				}else{
					System.out.println("Defense goal");
				}
			}
			//generate a new random number
			goalGenerator = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			scoringPlayer = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		}
	}
}