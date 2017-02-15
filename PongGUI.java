package edu.neumont.csc150.Pong.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PongGUI{
	
	private JFrame window;
	
	private JPanel gamePanel, player1ScorePanel, player2ScorePanel, menuPanel;
	
	//public Ball pongBall = new Ball();
	
	//public Paddle leftPaddle = new Paddle(3, 3, true);
	
	//public Paddle rightPaddle = new Paddle(3, 3, false);
	
	public PongGUI() {
		
	}
	
	public PongGUI(Game myGame) {
		
	}
	
	private void initGUI(){
		gamePanel = new JPanel();
		player1ScorePanel = new JPanel();
		player2ScorePanel = new JPanel();
		menuPanel = new JPanel();

		window.getContentPane().add(player1ScorePanel);
		window.getContentPane().add(menuPanel);
		window.getContentPane().add(player2ScorePanel);
		window.getContentPane().add(gamePanel);
	}
	
	public void initMainGUI(){
		window = new JFrame("Ping Pong");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		initGUI();
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	
}