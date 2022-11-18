import java.util.ArrayList;
import java.util.Map.*;

public class Standings{

	private ArrayList<Team> teams = new ArrayList<Team>();

	public Standings(ArrayList<Team> teams){
		this.teams = teams;
	}
	public void printStandings(){
		
		this.sort(teams);
		
		for(int i = 0; i < teams.size(); i++){

			System.out.println(teams.get(i).getName() + " " + teams.get(i).getPoints());
		}
	}
	public void sort(ArrayList<Team> teams){

		teams.sort((o1, o2) -> Integer.compare(o1.getPoints(), o2.getPoints()));
	}
}