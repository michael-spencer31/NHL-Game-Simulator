import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

public class Game{

	public void playGame(Team t1, Team t2){

		var teamOneGoals = 0;
		var teamTwoGoals = 0;

		ArrayList teamOneNumbers = new ArrayList();
		ArrayList teamTwoNumbers = new ArrayList();

		//advantageTeam = ThreadLocalRandom.current().nextInt(1, 1);
		int advantageTeam = getEdge(t1, t2);
		//if the two teams are even
		if(advantageTeam == 0){
			teamOneNumbers.add(1);
			teamOneNumbers.add(2);
			teamOneNumbers.add(3);
			teamOneNumbers.add(4);
			teamOneNumbers.add(5);
			teamTwoNumbers.add(6);
			teamTwoNumbers.add(7);
			teamTwoNumbers.add(8);
			teamTwoNumbers.add(9);
			teamTwoNumbers.add(10);
		}else if(advantageTeam == 1){
			teamOneNumbers.add(1);
			teamOneNumbers.add(2);
			teamOneNumbers.add(3);
			teamOneNumbers.add(4);
			teamOneNumbers.add(5);
			teamOneNumbers.add(6);
			teamTwoNumbers.add(7);
			teamTwoNumbers.add(8);
			teamTwoNumbers.add(9);
			teamTwoNumbers.add(10);
		}else if(advantageTeam == 2){
			teamOneNumbers.add(1);
			teamOneNumbers.add(2);
			teamOneNumbers.add(3);
			teamOneNumbers.add(4);
			teamOneNumbers.add(5);
			teamOneNumbers.add(6);
			teamOneNumbers.add(7);
			teamOneNumbers.add(8);
			teamTwoNumbers.add(9);
			teamTwoNumbers.add(10);
		}else if(advantageTeam == -1){
			teamOneNumbers.add(1);
			teamOneNumbers.add(2);
			teamOneNumbers.add(3);
			teamOneNumbers.add(4);
			teamTwoNumbers.add(5);
			teamTwoNumbers.add(6);
			teamTwoNumbers.add(7);
			teamTwoNumbers.add(8);
			teamTwoNumbers.add(9);
			teamTwoNumbers.add(10);
		}else if(advantageTeam == -2){
			teamOneNumbers.add(1);
			teamOneNumbers.add(2);
			teamOneNumbers.add(3);
			teamTwoNumbers.add(4);
			teamTwoNumbers.add(5);
			teamTwoNumbers.add(6);
			teamTwoNumbers.add(7);
			teamTwoNumbers.add(8);
			teamTwoNumbers.add(9);
			teamTwoNumbers.add(10);
		}
		//generate a random number from 1-10
		int goalGenerator = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		//generate a random number to determine who scored
		int scoringPlayer = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		//generate a team to score
		int scoringTeam = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		int teamThatScored = 0;

		//in each game there are 10 chances for a team to score a goal
		for(int i = 0; i < 20; i++){

			if(teamOneNumbers.contains(scoringTeam)){
				teamThatScored = 1;
			}else{
				teamThatScored = 2;
			}
			if(goalGenerator > 6){

				if(scoringPlayer >= 7){

					if(teamThatScored == 1){
						getGoalScorer(t1, 1);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 1);
						teamTwoGoals++;
					}
				}else if(scoringPlayer == 4 || scoringPlayer == 5 || scoringPlayer == 6){
					
					if(teamThatScored == 1){
						getGoalScorer(t1, 2);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 2);
						teamTwoGoals++;
					}
				}else if(scoringPlayer == 2 || scoringPlayer == 3){
					
					if(teamThatScored == 1){
						getGoalScorer(t1, 3);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 3);
						teamTwoGoals++;
					}
				}else if(scoringPlayer == 1){
					
					if(teamThatScored == 1){
						getGoalScorer(t1, 4);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 4);
						teamTwoGoals++;
					}
				}else{
					if(teamThatScored == 1){
						getGoalScorer(t1, 5);
						teamOneGoals++;
					}else{
						getGoalScorer(t2, 5);
						teamTwoGoals++;
					}
				}
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					Thread.currentThread().interrupt();
				}
			}
			//generate a new random number
			scoringTeam = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			goalGenerator = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			scoringPlayer = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		}
		int otWinner = ThreadLocalRandom.current().nextInt(0, 1 + 1);
		int otPlayer = ThreadLocalRandom.current().nextInt(0, 5 + 1);
		//start overtime if teams are tied after main game loop
		//in ot we just do a coin flip to determine who wins
		if(teamOneGoals == teamTwoGoals){
			
			if(otWinner == 0){
				teamOneGoals++;
				getGoalScorer(t1, otPlayer);
				t1.winGame();
				System.out.println(t1.getName() + " beat the " + t2.getName() + " " + teamOneGoals + "-" + teamTwoGoals + " in overtime");
				return;
			}else{
				teamTwoGoals++;
				t2.winGame();
				getGoalScorer(t2, otPlayer);
				System.out.println(t2.getName() + " beat the " + t1.getName() + " " + teamTwoGoals + "-" + teamOneGoals + " in overtime");
				return;
			}
		}
		//otherwise the game ended in regulation time
		if(teamOneGoals > teamTwoGoals){
			t1.winGame();
			System.out.println(t1.getName() + " beat the " + t2.getName() + " " + teamOneGoals + "-" + teamTwoGoals);
		}else{
			t2.winGame();
			System.out.println(t2.getName() + " beat the " + t1.getName() + " " + teamTwoGoals + "-" + teamOneGoals);
		}
		
	}
	//given a line, randomly generate a player to score a goal
	public void getGoalScorer(Team team, int line){

		UpdateScorers goalUpdate = new UpdateScorers();

		//determine how many assists occured on a goal
		int numberOfAssists = ThreadLocalRandom.current().nextInt(0, 2 + 1);
		int forwardordefense = ThreadLocalRandom.current().nextInt(0, 1 + 1);

		int firstAssist = 0;
		int secondAssist = 0;

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

		int lineScorerHolder = lineScorer;
		int lowHolder = lineScorer - 1;
		int highHolder = lineScorer + 2;

		if(numberOfAssists == 1){

			firstAssist = ThreadLocalRandom.current().nextInt(0, 18 + 1);

			if(firstAssist == lineScorer){

				firstAssist = 19;
			}
			System.out.println("Assisted by: " + team.players[firstAssist][0]);
			goalUpdate.updateAssists((String)team.players[firstAssist][0]);
		}else if(numberOfAssists == 2){

			firstAssist = ThreadLocalRandom.current().nextInt(0, 7 + 1);
			secondAssist = ThreadLocalRandom.current().nextInt(8, 15 + 1);

			if(firstAssist == lineScorer){

				firstAssist = 17;
			}else if(secondAssist == lineScorer){
				secondAssist = 18;
			}
			System.out.println("Assisted by: " + team.players[firstAssist][0] + " and " + team.players[secondAssist][0]);
			goalUpdate.updateAssists((String)team.players[firstAssist][0]);
			goalUpdate.updateAssists((String)team.players[secondAssist][0]);
		}else if(numberOfAssists == 0){
			System.out.println("No assists");
		}

		Object scorer = team.players[lineScorer][0];

		//cast the player to a string to put into a hashmap later
		String stringPlayer = (String)scorer;

		goalUpdate.updateGoals(stringPlayer);
	}
	//this code tries to determine which team is stronger and gives them an advantage
	public int getEdge(Team t1, Team t2){

		//get the relative strength of each team
		int teamOneStrength = t1.getStrength();
		int teamTwoStrength = t2.getStrength();

		int relativeStrength = teamOneStrength - teamTwoStrength;

		//team strength are close to eachother: no buff
		if(relativeStrength <= 10 && relativeStrength >= -10){
			return 0;
		}
		//small buff for team 1
		if(relativeStrength >= 11 && relativeStrength <= 30){
			return 1;
		}
		//large buff for team 1
		if(relativeStrength > 31){
			return 2;
		}
		//small buff for team 2
		if(relativeStrength <= -11 && relativeStrength >= -30){
			return -1;
		}
		//large buff for team 2
		if(relativeStrength < -31){
			return -2;
		}
		return 10;
	}
}