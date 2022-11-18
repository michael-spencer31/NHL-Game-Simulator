import java.util.ArrayList;

public class GenerateTeams{

	public ArrayList<Team> buildTeams(){

		ArrayList<Team> teamList = new ArrayList<Team>();

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

		Object[][] calgaryPlayers = { {"Adam Ruzicka", "F", 84, 1},
		{"Elias Lindholm", "F", 88, 1}, {"Tyler Toffoli", "F", 89, 1},
		{"Milan Lucic", "F", 83, 2}, {"Nazem Kadri", "F", 84, 2},
		{"Andrew Mangiapane", "F", 85, 2}, {"Jonathan Huberdeau", "F", 93, 3},
		{"Mikael Backlund", "F", 83, 3}, {"Trevor Lewis", "F", 83, 3},
		{"Blake Coleman", "F", 81, 4}, {"Dillon Dube", "F", 80, 4},
		{"Brett Ritchie", "F", 77, 4}, {"Noah Hanifin", "D", 85, 1},
		{"Rasmus Andersson", "D", 83, 1}, {"Mackenzie Weegar", "D", 84, 2},
		{"Chris Tanev", "D", 82, 2}, {"Nikita Zadorov", "D", 80, 3},
		{"Nick Desimone", "D", 71, 3}, {"Jacob Markstrom", "G", 90, 1} };

		Object[][] ottawaPlayers = { {"Brady Tkachuk", "F", 90, 1},
		{"Tim Stutzle", "F", 92, 1}, {"Claude Giroux", "F", 87, 1},
		{"Alex Debrincat", "F", 90, 2}, {"Derick Brassard", "F", 85, 2},
		{"Mathieu Joseph", "F", 82, 2}, {"Tyler Motte", "F", 81, 3},
		{"Shane Pinto", "F", 80, 3}, {"Drake Batherson", "F", 85, 3},
		{"Parker Kelly", "F", 77, 4}, {"Dylan Gambrell", "F", 74, 4},
		{"Austin Watson", "F", 68}, {"Jake Sanderson", "D", 88, 1},
		{"Travis Hamonic", "D", 84, 1}, {"Erik Brannstrom", "D", 85, 2},
		{"Jacob Bernard-Docker", "D", 84, 2}, {"Nick Holden", "D", 77, 3},
		{"Anton Forsberg", "D", 73, 3}, {"Cam Talbot", "G", 88, 1} };

		Object[][] seattlePlayers = { {"Jaden Schwartz", "F", 85, 1},
		{"Alaxander Wennberg", "F", 83, 1}, {"Andre Burakovsky", "F", 84, 1},
		{"Jared Mccann", "F", 81, 2}, {"Matthew Beniers", "F", 86, 2},
		{"Jordan Eberle", "F", 82, 2}, {"Oilver Bjorkstrand", "F", 80, 3},
		{"Yanni Gourde", "F", 79, 3}, {"Brandon Tanev", "F", 77, 3},
		{"Ryan Donato", "F", 77, 4}, {"Morgan Geekie", "F", 75, 4},
		{"Karson Kuhlman", "F", 72, 4}, {"Vince Dunn", "D", 86, 1},
		{"Adam Larsson", "D", 82, 1}, {"Carson Soucy", "D", 80, 2},
		{"Justin Schultz", "D", 75, 2}, {"William Borgen", "D", 72, 3},
		{"Gustav Olofsson", "D", 64, 3}, {"Martin Jones", "G", 81, 1} };
		//a team with very bad players, for testing
		//a "good" team should beat this team >90% of the team
		Object[][] badPlayers = { {"Ryan Reynolds", "F", 1, 1},
		{"Harry Potter", "F", 3, 1}, {"Emma Turner", "F", 3, 1},
		{"Luna Lovegood", "F", 7, 2}, {"Homer Simpson", "F", 0, 2},
		{"Lisa Simpson", "F", 1, 2}, {"Hermione Granger", "F", 10, 3},
		{"Ron Weasley", "F", 5, 3}, {"Ginny Weasley", "F", 11, 3},
		{"Draco Malfoy", "F", 1, 4}, {"Neville Longbottom", "F", 1, 4},
		{"Lord Voldemort", "F", 13, 4}, {"Kelsea Ballerini", "D", 1, 1},
		{"Bart Simpson", "D", 14, 1}, {"Ariadna Seyfried", "D", 3, 2},
		{"Fallon Hanson", "D", 12, 2}, {"Sierra Hunter", "D", 17, 3},
		{"Abbie Haynes", "D", 1, 3}, {"Jess Trafton", "G", 1, 1} };

		//create a couple of teams 
		Team SeattleKraken = new Team("Seattle Kraken", seattlePlayers, 0, 0, 0);
		Team MontrealCanadiens = new Team("Montreal Canadiens", montrealPlayers, 0, 0, 0);
		Team EdmontonOilers = new Team("Edmonton Oilers", edmontonPlayers, 0, 0, 0);
		Team TorontoMapleLeafs = new Team("Toronto Maple Leafs", torontoPlayers, 0, 0, 0);
		Team CalgaryFlames = new Team("Calgary Flames", calgaryPlayers, 0, 0, 0);
		Team OttawaSenators = new Team("Ottawa Senators", ottawaPlayers, 0, 0, 0);
		Team BadTeam = new Team("Bad Team", badPlayers, 0, 0, 0);

		teamList.add(MontrealCanadiens);
		teamList.add(SeattleKraken);
		teamList.add(TorontoMapleLeafs);
		teamList.add(EdmontonOilers);
		teamList.add(CalgaryFlames);
		teamList.add(OttawaSenators);

		return teamList;
	}
}