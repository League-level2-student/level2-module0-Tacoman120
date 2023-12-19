package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) {
		boolean finished = false;
		Robot[] rob = new Robot[5];
		for(int x = 0; x<rob.length; x++) {
			rob[x] = new Robot();
			rob[x].setX((180*x)+100);
			rob[x].setY(550);
		}
		Random ran = new Random();
		while(finished == false){
		for(int i = 0; i<rob.length; i++) {
			int num = ran.nextInt(50);
			rob[i].move(num);
			if(rob[i].getY() <= 0) {
				finished  = true;
				break;
			}
		}
		}
		if(finished = true) {
			for(int y = 0; y<5; y++) {
			for(int x = 0; x<rob.length; x++) {
				rob[x].setSpeed(100);
				rob[x].turn(360);
			}
			}
		}
	}
	//2. create an array of 5 robots.
		//done
	//3. use a for loop to initialize the robots.
		//done
	//4. make each robot start at the bottom of the screen, side by side, facing up
		//done
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		//done
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
	//7. declare that robot the winner and throw it a party!
		
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
