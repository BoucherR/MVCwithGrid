import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;

public class Controller implements ActionListener {
	
	View view;
	Model m;
	
	public Controller() {
		view = new View(this);
		m = new Model();
	}
	
	public void actionPerformed(ActionEvent e) {
		String coord[] = e.getActionCommand().split(",");
		System.out.println("You clicked: " + coord[0] + "," + coord[1]);
		int userX = Integer.parseInt(coord[0]);
		int userY = Integer.parseInt(coord[1]);
		m.guess(userX, userY);	
		
		JButton button = (JButton)e.getSource();
		
		button.setEnabled(false); 
	}
	
	public void playGame() {
		m.setBadSpaces();
		m.printBoard();
	}
	
	public static void main(String[] args) {
		Controller con = new Controller();
		con.playGame();
	
	}

}
