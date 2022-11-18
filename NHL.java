import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

@SuppressWarnings("unchecked")

public class NHL{

	public static void main(String[] args){
		
		Game game = new Game();

		GenerateTeams teamGenerator = new GenerateTeams();

		ArrayList<Team> teams = teamGenerator.buildTeams();

		Schedule scheduleMaker = new Schedule();
		scheduleMaker.createSchedule(teams);

		UpdateScorers scoreTracker = new UpdateScorers();

		HashMap<String, Integer> goalList = scoreTracker.getPlayerGoals();

		Trophies trophyPicker = new Trophies();
		trophyPicker.getRocketTrophy(goalList);

		Standings standings = new Standings(teams);
		standings.printStandings();
	}
}