public class NHL{

	public static void main(String[] args){

		Object[][] montrealPlayers = { {"Nick Suzuki", "F", 88, 1},
		{"Cole Caufield", "F", 87, 1}, {"Kirby Dach", "F", 87, 1},
		{"Mike Hoffman", "F", 83, 2}, {"Chistian Dvorak", "F", 86, 2},
		{"Brendan Gallagher", "F", 84, 2}, {"Evgeni Dadonov", "F", 85, 3},
		{"Sean Monahan", "F", 81, 3}, {"Josh Anderson", "F", 86, 3},
		{"Jonathan Drouin", "F", 81, 4}, {"Jake Evans", "F", 83, 4},
		{"Joel Armia", "F", 79, 4}, {"Kaiden Guhle", "D", 85, 1},
		{"David Savard", "D", 83, 1}, {"Joel Edmundson", "D", 84, 2},
		{"Arber Xhekaj", "D", 82, 2}, {"Jordan Harris", "D", 82, 3},
		{"Jonathan Kovacevic", "D", 78, 3}, {"Jake Allen", "G", 85, 1}};

		Object[][] edmontonPlayers = { {"Connor McDavid", "F", 97, 1},
		{"Leon Draisaitl", "F", 93, 1}, {"Evander Kane", "F", 87, 1},
		{"Dylan Holloway", "F", 81, 2}, {"Zach Hyman", "F", 85, 2},
		{"Warren Foegele", "F", 83, 3}, {"Ryan Mcleod", "F", 81, 3},
		{"Klim Kostin", "F", 81, 3}, {"Mattias Janmark", "F", 79, 4},
		{"Devin Shore", "F", 77, 4}, {"Derek Ryan", "F", 75, 4},
		{"Darnell Nurse", "D", 88, 1}, {"Tyson Barrie", "D", 83, 1},
		{"Brett Kulak", "D", 81, 2}, {"Evan Bouchard", "D", 82, 2},
		{"Markus Niemelainen", "D", 77, 3}, {"Oscar Klefbom", "D", 81, 3},
		{"Jack Campbell", "G", 85, 1}, {"Kailer Yamamoto", "F", 84, 2} };

		Object[][] torontoPlayers = { {"Auston Matthews", "F", 91, 1},
		{"William Nylander", "F", 89, 1}, {"Michael Bunting", "F", 84, 1},
		{"Mitch Marner", "F", 91, 2}, {"John Travares", "F", 93, 2},
		{"Alaxander Kerfoot", "F", 84, 2}, {"Pierre Engvall", "F", 84, 3},
		{"Pontus Holmberg", "F", 80, 3}, {"Calle Jamkrok", "F", 81, 3},
		{"Zach Aston-Reese", "F", 83, 4}, {"David Kampf", "F", 81, 4},
		{"Denis Malgin", "F", 77, 4}, {"Morgan Rielly", "D", 86, 1},
		{"Jordie Benn", "D", 84, 1}, {"Mark Giodano", "D", 82, 2},
		{"Justin Holl", "D", 82, 2}, {"Rasmus Sandin", "D", 83, 3},
		{"Timothy Liljegren", "D", 73, 3}, {"Erik Kallgren", "G", 77, 1} };

		//create a couple of teams 
		Team MontrealCanadiens = new Team("Montreal Canadiens", montrealPlayers);
		Team EdmontonOilers = new Team("Edmonton Oilers", edmontonPlayers);
		Team TorontoMapleLeafs = new Team("Toronto Maple Leafs", torontoPlayers);

		Game game = new Game();
		game.playGame(MontrealCanadiens, TorontoMapleLeafs);
	}
}