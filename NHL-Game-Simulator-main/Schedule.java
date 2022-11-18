import java.util.ArrayList;

public class Schedule{

	//at the moment, each team just plays every other team 1 time
	//this could be expanded to create a better schedule
	public void createSchedule(ArrayList<Team> teams){

		Game game = new Game();

		int numberOfTeams = teams.size();

		for(int i = 0; i < numberOfTeams; i++){

			for(int j = i + 1; j < numberOfTeams; j++){

				if(teams.get(i) != teams.get(j)){

					game.playGame(teams.get(i), teams.get(j));
				}
			}
		}
	}
}