/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame frame;
	JPanel panel;
	int hButtonNum;
	int inputNum = 5;
	JButton button[];

	//1. create an array of JButtons. Don't initialize it yet.

	
	
	
	//2 create an int variable called hiddenButton
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		

		
		

		
		//3.  Ask the user to enter a positive number and convert it to an int
		try {
			inputNum = Integer.parseInt(JOptionPane.showInputDialog("Input a positive number"));
		} catch (Exception e) {
			// TODO: handle exception
			//inputNum = -1;
		}
		
		frame = new JFrame("Find the Button");
		panel = new JPanel();
		JLabel label = new JLabel("Find the hidden button");
		frame.add(panel);
		panel.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		button = new JButton[inputNum];


		Random rand = new Random();
		hButtonNum = rand.nextInt(button.length);
		
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton();
			panel.add(button[i]);
			button[i].addActionListener(this);
				
			
			//robot[i].robot();
			//robs[i].setX((i+1)*150);
			//robs[i].setY(450);
			System.out.println("Creating Button # " + i);
		}
		
		
		button[hButtonNum].setText("ME");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		label.setText("");
		button[hButtonNum].setText("");

		//4. Initialize the array of JButtons to be the size of the int created in step 3
		
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		
		//14. Set the text of the JButton located at hiddenButton to  "ME"

		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.

		
			if(e.getSource() == button[hButtonNum]) {
				button[hButtonNum].setText("WOW YOU DID IT");

			}else {
				buttonClicked.setText("Wrong");
				//button[i].setText("You clicked the wrong button");
				//button[hButtonNum].setText("I am the correct Button");

			}
		

		//18. else tell them to try again
	}
}
