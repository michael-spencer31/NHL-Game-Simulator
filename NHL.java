import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
public class NHL{

	public static void main(String[] args){
		
		Game game = new Game();

		GenerateTeams teamGenerator = new GenerateTeams();

		ArrayList<Team> teams = teamGenerator.buildTeams();

		game.playGame(teams.get(0), teams.get(1));
		game.playGame(teams.get(0), teams.get(4));

		UpdateScorers scoreTracker = new UpdateScorers();

		HashMap<String, Integer> goalList = scoreTracker.getPlayerGoals();

		Trophies trophyPicker = new Trophies();
		trophyPicker.getRocketTrophy(goalList);
	}
}