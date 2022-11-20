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
	public void playSingleGame(Team t1, Team t2){

		Game game = new Game();
	}
}