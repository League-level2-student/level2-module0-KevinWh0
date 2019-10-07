package arrays;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean done;

	public static void main(String[] args) {
		Robot robs[] = new Robot[5];
		for(int i = 0; i < 5; i++) {
			robs[i] = new Robot();
			//robot[i].robot();
			robs[i].setX((i+1)*150);
			robs[i].setY(450);
			System.out.println("Creating Bot # " + i);
		}
		while(!done) {
			for(int i = 0; i < 5; i++) {
				//robs[i] = new Robot();
				//robot[i].robot();
				robs[i].setSpeed(500);
				robs[i].move(random(50));
				System.out.println("Creating Bot # " + i);
				if(robs[i].getY() < 1 && done == false) {
					done = true;
					JOptionPane.showMessageDialog(null, "Bot "+(i+1) +" Won");
				}
			}	
		}

	}
	static int random(int amt) {

		Random rand = new Random();
		
		return rand.nextInt(amt);
		
		
	
	}

	//2. create an array of 5 robots.
	
	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
