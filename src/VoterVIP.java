import javax.swing.JOptionPane;

public class VoterVIP {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("enter age here");
	int num = Integer.parseInt(age);
	if (num < 18) {
		JOptionPane.showInputDialog(null, "who do you think should be president");
		JOptionPane.showMessageDialog(null, "nobody cares what you think");
	}
	if (num > 18) {
		JOptionPane.showInputDialog(null, "who do you think the next president should be");
		JOptionPane.showMessageDialog(null, "great! Youre suggustion matters!!!");
	}
}
}
