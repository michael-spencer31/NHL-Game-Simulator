import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;

public class Game{

	public void playGame(Team t1, Team t2){

		int advantageTeam = getEdge(t1, t2);

		var teamOneGoals = 0;
		var teamTwoGoals = 0;

		if(advantageTeam == 1){

		}

		//generate a random number from 1-10
		int goalGenerator = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		//generate a random number to determine who scored
		int scoringPlayer = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		//generate a team to score
		int scoringTeam = ThreadLocalRandom.current().nextInt(0, 1 + 1);

		for(int i = 0; i < 10; i++){

			if(goalGenerator > 6){

				if(scoringPlayer >= 7){

					if(scoringTeam == 0){
						getGoalScorer(t1, 1);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 1);
						teamTwoGoals++;
					}
				}else if(scoringPlayer == 4 || scoringPlayer == 5 || scoringPlayer == 6){
					
					if(scoringTeam == 0){
						getGoalScorer(t1, 2);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 2);
						teamTwoGoals++;
					}
				}else if(scoringPlayer == 2 || scoringPlayer == 3){
					
					if(scoringTeam == 0){
						getGoalScorer(t1, 3);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 3);
						teamTwoGoals++;
					}
				}else if(scoringPlayer == 1){
					
					if(scoringTeam == 0){
						getGoalScorer(t1, 4);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 4);
						teamTwoGoals++;
					}
				}else{
					if(scoringTeam == 0){
						getGoalScorer(t1, 5);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 5);
						teamTwoGoals++;
					}
				}
			}
			//generate a new random number
			scoringTeam = ThreadLocalRandom.current().nextInt(0, 1 + 1);
			goalGenerator = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			scoringPlayer = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		}
		int otWinner = ThreadLocalRandom.current().nextInt(0, 1 + 1);

		if(teamOneGoals == teamTwoGoals){
			//ot
			if(otWinner == 0){
				teamOneGoals++;
			}else{
				teamTwoGoals++;
			}
		}
		if(teamOneGoals > teamTwoGoals){
			System.out.println(t1.getName() + " beat the " + t2.getName() + " " + teamOneGoals + "-" + teamTwoGoals);
		}else{
			System.out.println(t2.getName() + " beat the " + t1.getName() + " " + teamTwoGoals + "-" + teamOneGoals);
		}
	}
	//given a line, randomly generate a player to score a goal
	public void getGoalScorer(Team team, int line){

		int lineScorer = 0;

		if(line == 1){
			lineScorer = ThreadLocalRandom.current().nextInt(0, 2 + 1);
		}else if(line == 2){
			lineScorer = ThreadLocalRandom.current().nextInt(3, 5 + 1);
		}else if(line == 3){
			lineScorer = ThreadLocalRandom.current().nextInt(6, 8 + 1);
		}else if(line == 4){
			lineScorer = ThreadLocalRandom.current().nextInt(9, 11 + 1);
		}else{
			lineScorer = ThreadLocalRandom.current().nextInt(12, 17 + 1);
		}
		System.out.println(team.players[lineScorer][0]);
	}
	public int getEdge(Team t1, Team t2){

		//get the relative strength of each team
		int teamOneStrength = t1.getStrength();
		int teamTwoStrength = t2.getStrength();

		int relativeStrength = teamOneStrength - teamTwoStrength;

		//team one is stronger
		if(relativeStrength >= 0){
			return 1;
		}
		return 2;
	}
}