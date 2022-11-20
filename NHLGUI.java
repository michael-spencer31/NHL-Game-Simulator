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

	public void createGUI(){

		teamPanel = new JPanel();
		teamPanel.setLayout(new GridLayout(2, 2, 10, 10));

		label1 = new JButton();
		label2 = new JButton();
		label3 = new JButton();
		label4 = new JButton();

		label1.addActionListener(this);
		label2.addActionListener(this);
		label3.addActionListener(this);
		label4.addActionListener(this);

		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("emma.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label1.setIcon(imageIcon1);

		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("cait.jpeg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label2.setIcon(imageIcon2);

		ImageIcon imageIcon3 = new ImageIcon(new ImageIcon("shawne.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label3.setIcon(imageIcon3);

		ImageIcon imageIcon4 = new ImageIcon(new ImageIcon("aidan.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		label4.setIcon(imageIcon4);

		frame = new JFrame("Test");

		teamPanel.add(label1);
		teamPanel.add(label2);
		teamPanel.add(label3);
		teamPanel.add(label4);

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