import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.Map.*;
import java.util.ArrayList;

/**
* this class is responsible for finding the winners of the
* end of season awards
*/
public class Trophies{

	//this function finds the player with the most goals 
	//the Maurice "Rocket" Richard Trophy is given yearly to
	//the player with the most goals at the end of the NHL
	//regular season
	public void getRocketTrophy(HashMap<String, Integer> playerGoals){

		//first find the highest value of goals in the map
		int maxGoals = Collections.max(playerGoals.values());

		List<String> keys = new ArrayList<>();

		//now loop through the map and find the player(s) with the most goals
		for(Entry<String, Integer> entry: playerGoals.entrySet()){

			if(entry.getValue() == maxGoals){

				keys.add(entry.getKey());
			}
		}
		System.out.println(keys + " " + maxGoals);	
	}
	//this function is the same as above except it gets assists instead of goals
	public void getMostPoints(HashMap<String, Integer> playerAssists){

		int maxAssists = Collections.max(playerAssists.values());

		List<String> keys = new ArrayList<>();

		for(Entry<String, Integer> entry: playerAssists.entrySet()){

			if(entry.getValue() == maxAssists){

				keys.add(entry.getKey());
			}
		}
	}
}