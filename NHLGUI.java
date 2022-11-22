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
	private static JButton label1;
	private static JButton label2;
	private static JButton label3;
	private static JButton label4;
	private static JButton label5;
	private static JButton WinnipegJets;
	private static JButton EdmontonOilers;
	private static JButton label8;
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

		scoresLabel.setText("Click on 2 buttons to start a game");
		infoPanel.add(scoresLabel);

		label1 = new JButton();
		label2 = new JButton();
		label3 = new JButton();
		label4 = new JButton();
		label5 = new JButton();
		WinnipegJets = new JButton();
		EdmontonOilers = new JButton();
		label8 = new JButton();

		label1.addActionListener(this);
		label2.addActionListener(this);
		label3.addActionListener(this);
		label4.addActionListener(this);
		label5.addActionListener(this);
		WinnipegJets.addActionListener(this);
		EdmontonOilers.addActionListener(this);
		label8.addActionListener(this);

		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("assests/images/emma.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label1.setIcon(imageIcon1);

		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("assests/images/cait.jpeg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label2.setIcon(imageIcon2);

		ImageIcon imageIcon3 = new ImageIcon(new ImageIcon("assests/images/shawne.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label3.setIcon(imageIcon3);

		ImageIcon imageIcon4 = new ImageIcon(new ImageIcon("assests/images/aidan.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label4.setIcon(imageIcon4);

		ImageIcon imageIcon5 = new ImageIcon(new ImageIcon("assests/images/elise.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label5.setIcon(imageIcon5);

		ImageIcon imageIcon6 = new ImageIcon(new ImageIcon("assests/images/sierra.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		WinnipegJets.setIcon(imageIcon6);

		ImageIcon imageIcon7 = new ImageIcon(new ImageIcon("assests/Logos/Edmonton Oilers.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		EdmontonOilers.setIcon(imageIcon7);

		ImageIcon imageIcon8 = new ImageIcon(new ImageIcon("assests/images/kelsey.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label8.setIcon(imageIcon8);

		frame = new JFrame("Test");

		teamPanel.add(label1);
		teamPanel.add(label2);
		teamPanel.add(label3);
		teamPanel.add(label4);
		teamPanel.add(label5);
		teamPanel.add(WinnipegJets);
		teamPanel.add(EdmontonOilers);
		teamPanel.add(label8);

		mainFrame.add(teamPanel, BorderLayout.NORTH);
		mainFrame.add(infoPanel, BorderLayout.SOUTH);

		mainFrame.setSize(500, 500);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("NHL");
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

		}
		System.out.println(teamList.size());
		count++;

		if(teamList.size() == 2){
			System.out.println("Two teams picked");
			gp.playSingleGame(teamList);
		}
	}
}