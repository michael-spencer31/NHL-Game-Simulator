import java.util.ArrayList;

public class NHL{

	public static void main(String[] args){
		
		Game game = new Game();

		GenerateTeams teamGenerator = new GenerateTeams();

		ArrayList<Team> teams = teamGenerator.buildTeams();

		game.playGame(teams.get(0), teams.get(1));
	}
}