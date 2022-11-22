import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

@SuppressWarnings("unchecked")

public class GamePlayer{

	//this will start and simulate a full season
	public void startSeason(){

		GenerateTeams teamGenerator = new GenerateTeams();

		ArrayList<Team> teamList = teamGenerator.buildTeams();

		Schedule scheduleMaker = new Schedule();
		scheduleMaker.createSchedule(teamList);

		UpdateScorers scoreTracker = new UpdateScorers();

		HashMap<String, Integer> goalList = scoreTracker.getPlayerGoals();

		Trophies trophyPicker = new Trophies();
		trophyPicker.getRocketTrophy(goalList);
		trophyPicker.getPresidentsTrophy(teamList);

		Standings standings = new Standings(teamList);
		standings.printStandings();
	}
	//this function will start and simulate a single game
	public void playSingleGame(ArrayList<String> teams){

		GenerateTeams teamGenerator = new GenerateTeams();

		ArrayList<Team> teamList = teamGenerator.buildTeams();

		String t1 = teams.get(0);
		String t2 = teams.get(1);

		int t1Pointer = 0;
		int t2Pointer = 0;

		int count = 0;

		while(count != teamList.size()){

			if(teamList.get(count).getName().equals(t1)){

				System.out.println("found t1");
				t1Pointer = count;
			}
			if(teamList.get(count).getName().equals(t2)){

				System.out.println("found t2");
				t2Pointer = count;
			}
			count++;
		}
		System.out.println(t1 + " " + t2);

		Game game = new Game();
		game.playGame(teamList.get(t1Pointer), teamList.get(t2Pointer));
	}
}