//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null,"you look... 'kay I guess");
			
		}
		else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null,"tfcytvyigbnihj");
		}
		else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null,"tfcytvyigbnihj");
		}
		else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null,"tfcytvyigbnihj");
		}
		else if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null,"tfcytvyigbnihj");
		}
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
