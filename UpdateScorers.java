import java.util.*;
import java.lang.Math.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

public class UpdateScorers{

	//create a hashmap to keep track of player goals and assists
	public static HashMap<Object, Integer> playerGoals = new HashMap<Object, Integer>();
	public static HashMap<Object, Integer> playerAssists = new HashMap<Object, Integer>();

	public void updateGoals(Object player){

		//this checks if the key already exists in the hashmap; if 
		//it does, add 1 to the key
		playerGoals.merge(player, 1, Integer::sum);

		//System.out.println(playerGoals);
	}
	public void updateAssists(Object player, int line, int scorer){

		//determine how many assists occured on a goal
		int numberOfAssists = ThreadLocalRandom.current().nextInt(0, 2 + 1);

		//no assists on goal
		if(numberOfAssists == 0){
			return;
		}
	}
}