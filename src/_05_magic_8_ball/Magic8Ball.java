//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random ran = new Random();
		int rnum = ran.nextInt(4);
	// 3. Print out this variable
		System.out.println(rnum);
	// 4. Get the user to enter a question for the 8 ball
		String bob = JOptionPane.showInputDialog("ask question"); 
		
	// 5. If the random number is 0

	// -- tell the user "Yes"
		if (rnum == 0) {
			JOptionPane.showMessageDialog(null, "yes!");
		}
	// 6. If the random number is 1
		if (rnum == 1) {
			JOptionPane.showMessageDialog(null, "no!");
		}
	// -- tell the user "No"

	// 7. If the random number is 2
		if (rnum == 2) {
			JOptionPane.showMessageDialog(null, "could ya... um,... ask g-google?!");
		}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		if (rnum == 3) {
			JOptionPane.showMessageDialog(null, "niwit. Cant belive you didn't know...");
		}
	// -- write your own answer

}
}