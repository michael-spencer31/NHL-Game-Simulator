import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

public class Game{

	public static HashMap<Object, Integer> playerGoals = new HashMap<Object, Integer>();

	public void playGame(Team t1, Team t2){

		int advantageTeam = getEdge(t1, t2);

		var teamOneGoals = 0;
		var teamTwoGoals = 0;

		ArrayList teamOneNumbers = new ArrayList();
		ArrayList teamTwoNumbers = new ArrayList();

		advantageTeam = 1;

		//if the two teams are even
		if(advantageTeam == 1){
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
		}

				System.out.println(teamOneNumbers);
		//generate a random number from 1-10
		int goalGenerator = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		//generate a random number to determine who scored
		int scoringPlayer = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		//generate a team to score
		int scoringTeam = ThreadLocalRandom.current().nextInt(0, 1 + 1);

		//in each game there are 10 chances for a team to score a goal
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
		int otPlayer = ThreadLocalRandom.current().nextInt(0, 5 + 1);
		//start overtime if teams are tied after main game loop
		//in ot we just do a coin flip to determine who wins
		if(teamOneGoals == teamTwoGoals){
			
			if(otWinner == 0){
				teamOneGoals++;
				getGoalScorer(t1, otPlayer);
				System.out.println(t1.getName() + " beat the " + t2.getName() + " " + teamOneGoals + "-" + teamTwoGoals + " in overtime");
				return;
			}else{
				teamTwoGoals++;
				getGoalScorer(t2, otPlayer);
				System.out.println(t2.getName() + " beat the " + t1.getName() + " " + teamTwoGoals + "-" + teamOneGoals + " in overtime");
				return;
			}
		}
		//otherwise the game ended in regulation time
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

		Object scorer = team.players[lineScorer][0];

		updateScorers(scorer);
	}
	//this code tries to determine which team is stronger and gives them an advantage
	public int getEdge(Team t1, Team t2){

		//get the relative strength of each team
		int teamOneStrength = t1.getStrength();
		int teamTwoStrength = t2.getStrength();

		int relativeStrength = teamOneStrength - teamTwoStrength;

		//if relative strength is POSITIVE team one is stronger
		//if relative strength is NEGATIVE team two is stronger
		
		//between -10 and +10: teams are equal - no buff for anyone
		
		//large buff for team 1
		if(relativeStrength > 30){


		}
		//between -10 and -30 or +10 and +30 - small buff for team 1 or 2 
		// > -30 or > +30: large buff for team 1 or 2
		return 2;
	}
	//this function uses a hashmap to keep track of players who score goals
	public void updateScorers(Object player){

		//this checks if the key already exists in the hashmap; if 
		//it does, add 1 to the key
		playerGoals.merge(player, 1, Integer::sum);
		
		System.out.println(playerGoals);
	}
}