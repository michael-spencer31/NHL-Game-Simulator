import java.util.*;

public class Team{
	private final String name;
	public Object[][] players;

	public Team(String name, Object[][] players){
		this.name = name;
		this.players = players;
	}
	public String printRoster(){
		return Arrays.deepToString(players).replace("],", "]\n");
	}
	public String getName(){
		return name;
	}
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
}