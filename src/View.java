/**
 * @author Ryan Boucher
 * @version 1.1
 */

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    //Fields
    private JPanel jButtonPanel;
    private JButton[][] gameButtons;
    private JPopupMenu popupMenu;

    public Controller controller;
    
    private static final int BOARD_SIZE = 8;

    public View(Controller controller){
    	
    	this.controller = controller;
    	
        jButtonPanel = new JPanel();
        setSize(800,800);
        jButtonPanel.setLayout(new GridLayout(BOARD_SIZE,BOARD_SIZE));
        add(jButtonPanel, BorderLayout.CENTER);

        gameButtons = new JButton[BOARD_SIZE][BOARD_SIZE];
        for(int i = 0; i < BOARD_SIZE;i++){
            for(int j = 0; j < BOARD_SIZE;j++){
            	
            	JButton buttonToAdd = new JButton();
            	buttonToAdd.addActionListener(controller);
            	buttonToAdd.setActionCommand(i + "," + j);
            	
                gameButtons[j][i]= buttonToAdd;
                jButtonPanel.add(gameButtons[j][i]);//adding buttons to the JPanel
                gameButtons[j][i].setEnabled(true);//Enabling all the buttons
                gameButtons[j][i].setBackground(Color.lightGray);
            }
        }
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
}