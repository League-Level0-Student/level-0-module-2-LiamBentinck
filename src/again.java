import javax.swing.JOptionPane;

public class again {
public static void main(String[] args) {
	String word = JOptionPane.showInputDialog("type message here");

	String num = JOptionPane.showInputDialog("type number here");
	int value = Integer.parseInt(num);
	for (int i = 0; i < value; i++) {
		System.out.println(word);
	}
}
}
