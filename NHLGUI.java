import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.ArrayList;

class NHLGUI extends JFrame implements ActionListener{

	private static JFrame frame;
	private static JPanel teamPanel;
	private static JPanel scoresPanel;
	private static JButton MontrealCanadiens;
	private static JButton OttawaSenators;
	private static JButton CarolinaHurricanes;
	private static JButton VegasGoldenKnights;
	private static JButton SeattleKraken;
	private static JButton WinnipegJets;
	private static JButton EdmontonOilers;
	private static JButton TorontoMapleLeafs;
	private static JLabel scoresLabel;
	private static JPanel infoPanel;
	private static JFrame mainFrame;
	private int count = 0;
	private ArrayList<String> teamList = new ArrayList<String>();


	public void createGUI(){

		mainFrame = new JFrame();

		teamPanel = new JPanel();
		teamPanel.setLayout(new GridLayout(2, 4, 10, 10));
		infoPanel = new JPanel();
		scoresPanel = new JPanel();
		scoresLabel = new JLabel();

		scoresLabel.setText("Click on 2 teams to start a game");
		infoPanel.add(scoresLabel);

		MontrealCanadiens = new JButton();
		OttawaSenators = new JButton();
		CarolinaHurricanes = new JButton();
		VegasGoldenKnights = new JButton();
		SeattleKraken = new JButton();
		WinnipegJets = new JButton();
		EdmontonOilers = new JButton();
		TorontoMapleLeafs = new JButton();

		MontrealCanadiens.addActionListener(this);
		OttawaSenators.addActionListener(this);
		CarolinaHurricanes.addActionListener(this);
		VegasGoldenKnights.addActionListener(this);
		SeattleKraken.addActionListener(this);
		WinnipegJets.addActionListener(this);
		EdmontonOilers.addActionListener(this);
		TorontoMapleLeafs.addActionListener(this);

		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("assests/Logos/Montreal Canadiens.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		MontrealCanadiens.setIcon(imageIcon1);

		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("assests/Logos/Ottawa Senators.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		OttawaSenators.setIcon(imageIcon2);

		ImageIcon imageIcon3 = new ImageIcon(new ImageIcon("assests/Logos/Carolina Hurricanes.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		CarolinaHurricanes.setIcon(imageIcon3);

		ImageIcon imageIcon4 = new ImageIcon(new ImageIcon("assests/Logos/Vegas Golden Knights.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		VegasGoldenKnights.setIcon(imageIcon4);

		ImageIcon imageIcon5 = new ImageIcon(new ImageIcon("assests/Logos/Seattle Kraken.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		SeattleKraken.setIcon(imageIcon5);

		ImageIcon imageIcon6 = new ImageIcon(new ImageIcon("assests/Logos/Winnipeg Jets.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		WinnipegJets.setIcon(imageIcon6);

		ImageIcon imageIcon7 = new ImageIcon(new ImageIcon("assests/Logos/Edmonton Oilers.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		EdmontonOilers.setIcon(imageIcon7);

		ImageIcon imageIcon8 = new ImageIcon(new ImageIcon("assests/Logos/Toronto Maple Leafs.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		TorontoMapleLeafs.setIcon(imageIcon8);

		frame = new JFrame("Test");

		teamPanel.add(MontrealCanadiens);
		teamPanel.add(OttawaSenators);
		teamPanel.add(CarolinaHurricanes);
		teamPanel.add(VegasGoldenKnights);
		teamPanel.add(SeattleKraken);
		teamPanel.add(WinnipegJets);
		teamPanel.add(EdmontonOilers);
		teamPanel.add(TorontoMapleLeafs);

		mainFrame.add(teamPanel, BorderLayout.NORTH);
		mainFrame.add(infoPanel, BorderLayout.SOUTH);

		mainFrame.setSize(750, 500);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("NHL Game Simulator");
		mainFrame.setLocationRelativeTo(null);

		mainFrame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){

		String teamOne = "", teamTwo = "";
		GamePlayer gp = new GamePlayer();

		if(e.getSource() == EdmontonOilers){
			teamList.add("Edmonton Oilers");
		}else if(e.getSource() == WinnipegJets){
			teamList.add("Winnipeg Jets");
		}else if(e.getSource() == SeattleKraken){
			teamList.add("Seattle Kraken");
		}else if(e.getSource() == VegasGoldenKnights){
			teamList.add("Vegas Golden Knights");
		}else if(e.getSource() == TorontoMapleLeafs){
			teamList.add("Toronto Maple Leafs");
		}else if(e.getSource() == CarolinaHurricanes){
			teamList.add("Carolina Hurricanes");
		}else if(e.getSource() == OttawaSenators){
			teamList.add("Ottawa Senators");
		}else if(e.getSource() == MontrealCanadiens){
			teamList.add("Montreal Canadiens");
		}
		count++;

		if(teamList.size() % 2 == 0){
			gp.playSingleGame(teamList, count);
		}
	}
}