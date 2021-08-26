package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		 
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String question = JOptionPane.showInputDialog(null, "what is the amount of bones in the human body");
				// 3.  Use an if statement to check if their answer is correct
				if (question.equalsIgnoreCase("206")) { 
					JOptionPane.showMessageDialog(null, "Correct! + 1 point");
				} else { JOptionPane.showMessageDialog(null, "INCORRECT! no point");
					}
				// 4.  if the user's answer was correct, add one to their score 
		if (question.equalsIgnoreCase("206")) { int userCount1  =+ 1;  } 
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
