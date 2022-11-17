import java.util.*;

public class Team{

	private final String name;
	public Object[][] players;
	private int wins;
	private int losses;
	private int overtime;

	public Team(String name, Object[][] players, int wins, int losses, int overtime){
		this.name = name;
		this.players = players;
		this.wins = wins;
		this.losses = losses;
		this.overtime = overtime;
	}
	public String printRoster(){
		return Arrays.deepToString(players).replace("],", "]\n");
	}
	public String getName(){
		return name;
	}
	//calculate the strength of the team by summing the strength of each player
	public int getStrength(){

		int strength = 0;
		for(int row = 0; row < players.length; row++){
			for(int col = 0; col < players[row].length; col++){
				if(col == 2){
					strength += (int)players[row][col];
				}
			}
		}
		System.out.println(strength);
		return strength;
	}
	//calculate and return the number of points a team has
	public int getPoints(){
		return (wins * 2) + overtime;
	}
}