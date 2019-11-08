package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("enter hieght here");
	int num = Integer.parseInt(height);
	if (num > 48) {
		JOptionPane.showMessageDialog(null, "congrats! You can ride the roller coaster that makes you vomit now! YAY!");
	}
	if (num < 48) {
		JOptionPane.showMessageDialog(null, "I'd hate to be you. You still have to grow! Nah, Nah, Nah! Wait, We have kiddy rides! HA!");
	}
}
}
