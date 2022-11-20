import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

class NHLGUI extends JFrame implements ActionListener{

	private static JFrame frame;
	private static JPanel teamPanel;
	private static JButton label1;
	private static JButton label2;
	private static JButton label3;
	private static JButton label4;
	private static JButton label5;
	private static JButton label6;
	private static JButton label7;
	private static JButton label8;

	public void createGUI(){

		teamPanel = new JPanel();
		teamPanel.setLayout(new GridLayout(2, 4, 10, 10));

		String s = "label";

		for(int i = 1; i < 6; i++){


		}

		label1 = new JButton();
		label2 = new JButton();
		label3 = new JButton();
		label4 = new JButton();
		label5 = new JButton();
		label6 = new JButton();
		label7 = new JButton();
		label8 = new JButton();

		label1.addActionListener(this);
		label2.addActionListener(this);
		label3.addActionListener(this);
		label4.addActionListener(this);
		label5.addActionListener(this);
		label6.addActionListener(this);
		label7.addActionListener(this);
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
		label6.setIcon(imageIcon6);

		ImageIcon imageIcon7 = new ImageIcon(new ImageIcon("assests/images/eefje.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label7.setIcon(imageIcon7);

		ImageIcon imageIcon8 = new ImageIcon(new ImageIcon("assests/images/kelsey.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label8.setIcon(imageIcon8);

		frame = new JFrame("Test");

		teamPanel.add(label1);
		teamPanel.add(label2);
		teamPanel.add(label3);
		teamPanel.add(label4);
		teamPanel.add(label5);
		teamPanel.add(label6);
		teamPanel.add(label7);
		teamPanel.add(label8);

		frame.setContentPane(teamPanel);


		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("NHL");
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){

		GamePlayer playGame = new GamePlayer();

		if(e.getSource() == this.label1){

			playGame.startSeason();
		}
	}
}