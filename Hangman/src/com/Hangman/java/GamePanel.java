package com.Hangman.java;

import javax.swing.JApplet;
//import javax.swing.JPanel;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;









//import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.util.Random;
import java.awt.Color;

import javax.swing.SwingConstants;

public class GamePanel extends JApplet {
	//oh noes, global variables :((
	private int lives = 8;
	private JTextField textField;
	private JTextField textField_1;
	private String[] wordList = { "MEMORY" , "COMPUTER" , "PRINTER" , "TROUSERS" , "BUTTERCUP" };
	private char[] guessWord;
	private char[] asterisks;
	private int wordCounter = 0;
	private boolean answerPressed = false;
/*	private String mem = "******";
	private String com = "********";
	private String print = "*******";
	private String trou = "********";
	private String butt = "*********";
*/
	/**
	 * Create the panel.
	 */
	
	public GamePanel() {
		getContentPane().setLayout(null);
		

		
		textField = new JTextField(24);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(130, 78, 240, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(3);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setEditable(false);
		textField_1.setBounds(340, 106, 30, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		//BUTTONS
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('A');
			}
		});
		btnNewButton.setBounds(10, 137, 56, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('H');
			}
		});
		btnH.setBounds(10, 171, 56, 23);
		getContentPane().add(btnH);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('O');
			}
		});
		btnO.setBounds(10, 205, 56, 23);
		getContentPane().add(btnO);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('V');
			}
		});
		btnV.setBounds(10, 239, 56, 23);
		getContentPane().add(btnV);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('B');
			}
		});
		btnB.setBounds(76, 137, 56, 23);
		getContentPane().add(btnB);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('I');
			}
		});
		btnI.setBounds(76, 171, 56, 23);
		getContentPane().add(btnI);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('P');
			}
		});
		btnP.setBounds(76, 205, 56, 23);
		getContentPane().add(btnP);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('W');
			}
		});
		btnW.setBounds(76, 239, 56, 23);
		getContentPane().add(btnW);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('C');
			}
		});
		btnC.setBounds(142, 137, 56, 23);
		getContentPane().add(btnC);
		
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('J');
			}
		});
		btnJ.setBounds(142, 171, 56, 23);
		getContentPane().add(btnJ);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('Q');
			}
		});
		btnQ.setBounds(142, 205, 56, 23);
		getContentPane().add(btnQ);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('X');
			}
		});
		btnX.setBounds(142, 239, 56, 23);
		getContentPane().add(btnX);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('D');
			}
		});
		btnD.setBounds(208, 137, 56, 23);
		getContentPane().add(btnD);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('K');
			}
		});
		btnK.setBounds(208, 171, 56, 23);
		getContentPane().add(btnK);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('R');
			}
		});
		btnR.setBounds(208, 205, 56, 23);
		getContentPane().add(btnR);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('Y');
			}
		});
		btnY.setBounds(208, 239, 56, 23);
		getContentPane().add(btnY);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('E');
			}
		});
		btnE.setBounds(274, 137, 56, 23);
		getContentPane().add(btnE);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('L');
			}
		});
		btnL.setBounds(274, 171, 56, 23);
		getContentPane().add(btnL);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkLetter('S');
			}
		});
		btnS.setBounds(274, 205, 56, 23);
		getContentPane().add(btnS);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('Z');
			}
		});
		btnZ.setBounds(274, 239, 56, 23);
		getContentPane().add(btnZ);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('F');
			}
		});
		btnF.setBounds(340, 137, 56, 23);
		getContentPane().add(btnF);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('M');
			}
		});
		btnM.setBounds(340, 171, 56, 23);
		getContentPane().add(btnM);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('T');
			}
		});
		btnT.setBounds(340, 205, 56, 23);
		getContentPane().add(btnT);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('G');
			}
		});
		btnG.setBounds(406, 137, 56, 23);
		getContentPane().add(btnG);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('N');
			}
		});
		btnN.setBounds(406, 171, 56, 23);
		getContentPane().add(btnN);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLetter('U');
			}
		});
		btnU.setBounds(406, 205, 56, 23);
		getContentPane().add(btnU);
		
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lives = 8;
				setWord();
				showAsterisks();
				showLives();
				answerPressed = false;
			}
		});
		btnStart.setBounds(274, 266, 80, 23);
		getContentPane().add(btnStart);
		
		
		JButton btnAnswer = new JButton("ANSWER");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showAnswer();
				textField_1.setText("");
				lives = 0;
				answerPressed = true;
			}
		});
		btnAnswer.setBounds(364, 266, 98, 23);
		getContentPane().add(btnAnswer);
		
		JLabel lblGuessTheWord = new JLabel("GUESS THE WORD");
		lblGuessTheWord.setForeground(Color.RED);
		lblGuessTheWord.setBounds(208, 60, 110, 14);
		getContentPane().add(lblGuessTheWord);
		
		JLabel lblLivesRemaining = new JLabel("GUESSES REMAINING");
		lblLivesRemaining.setForeground(Color.RED);
		lblLivesRemaining.setBounds(208, 109, 135, 14);
		getContentPane().add(lblLivesRemaining);
	}
	
	 public void init() {
		 setSize(490, 310);
		 //setWord();
		 //showLives();
		 //showAsterisks();
	 }
	 public void start(){}
	 public void stop(){}
	 public void destroy(){}

	 
	 // SETS THE WORD
	 private void setWord(){
		 //choose a word to guess
		 if(wordCounter < 5){
			 guessWord = wordList[wordCounter].toCharArray();
			 ++wordCounter;
		 } else {
			 wordCounter = 0;
			 guessWord = wordList[wordCounter].toCharArray();
			 ++wordCounter;
		 }
		 
		 /* initialise asterisks array with same number of astersisk as guess word */
		 asterisks = new char[guessWord.length];
		 for(int i = 0; i < asterisks.length; ++i){
			 asterisks[i] = '*';
		 }	 
	 }
	 
	 
	 //shows the asterisks word
	 private void showAsterisks(){
		 String word = new String(asterisks);
		 textField.setText(word);
	 }
	 
	 
	 //shows the answer for "answer" button
	 private void showAnswer(){
		 if(!textField.getText().equals("")){
			 asterisks = guessWord;
			 String word = new String(asterisks);
			 textField.setText(word);
		 }
	 }
	 
	 
	 //checks letter passed from letter button press
	 private void checkLetter(char letter){
		 if(!textField.getText().equals("")){		//if guessWord is displayed, check
			// textField.setText("" + letter);		FOR TESTS 1 to 26
			 boolean letterIsThere = false;
			 for(int i = 0; i < guessWord.length; ++i){
				 if(guessWord[i] == letter){
					 asterisks[i] = guessWord[i];
					 letterIsThere = true;
				 }
			 }
			 showAsterisks();
			 
			 //checks if lives is zero or below, then displays lose dialog
			 if(lives == 0){
				 checkLives();
			 }else if(!letterIsThere){
				 --lives;
				 checkLives();
			 }
			 showLives();
			 checkIfWin();
		 }
	 }
	 
	 
	 //check if still have lives left, if not -> you lose dialog displayed
	 private void checkLives(){
		 if(lives < 1){
			 //JPanel panel = new JPanel(); 
			 JLabel lose = new JLabel("You Lose");
			 lose.setForeground(Color.red);
			 lose.setHorizontalAlignment(SwingConstants.CENTER);
			 JOptionPane.showMessageDialog(null, lose, null, JOptionPane.PLAIN_MESSAGE); 
		 }
	 }
	 
	 
	 //shows lives
	 private void showLives(){
		 textField_1.setText(""+ lives);
	 }
	 
	 
	 //win check
	 private void checkIfWin(){
		 boolean hasAsterisks = false;
		 for(int i = 0; i < asterisks.length; ++i){
			 if(asterisks[i] == '*'){
				 hasAsterisks = true;
			 }
		 }
		 
		 //if asterisks array doesn't have asterisks - you won
		 if(!hasAsterisks && !answerPressed){
			 JLabel win = new JLabel("You Win");
			 win.setForeground(Color.blue);
			 win.setHorizontalAlignment(SwingConstants.CENTER);
			 JOptionPane.showMessageDialog(null, win, null, JOptionPane.PLAIN_MESSAGE); 
		 }
	 }
}
