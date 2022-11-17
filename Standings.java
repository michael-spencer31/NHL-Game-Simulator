import java.util.ArrayList;

public class Standings{

	private ArrayList<Team> teams = new ArrayList<Team>();

	public Standings(ArrayList<Team> teams){
		this.teams = teams;
	}
	public void printStandings(){

		for(int i = 0; i < teams.size(); i++){

			System.out.println(teams.get(i).getName() + " " + teams.get(i).getPoints());
		}
	}
}