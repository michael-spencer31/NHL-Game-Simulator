import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.Map.*;
import java.util.ArrayList;

public class UpdateScorers{

	//create a hashmap to keep track of player goals and assists
	public static HashMap<String, Integer> playerGoals = new HashMap<String, Integer>();
	public static HashMap<String, Integer> playerAssists = new HashMap<String, Integer>();

	public void updateGoals(String player){

		//this checks if the key already exists in the hashmap; if 
		//it does, add 1 to the key
		playerGoals.merge(player, 1, Integer::sum);
	}
	public void updateAssists(String player){

		playerAssists.merge(player, 1, Integer::sum);
	}
	public HashMap<String, Integer> getPlayerGoals(){
		return playerGoals;
	}
	public HashMap<String, Integer> getPlayerAssists(){
		return playerAssists;
	}
}