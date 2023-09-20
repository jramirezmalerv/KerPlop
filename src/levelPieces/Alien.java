package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;
import java.util.Random;

/**
 * Class definition for movable object Alien.
 * 
 * @author Gray St. Amant
 * @author Josh Ramirez
 * 
 * @Date: 9/14/23
 *
 *@Collaborators: N/A
 *
 * @Sources: N/A 
 */

//Uses the KILL interaction result


public class Alien extends GamePiece implements Moveable, Drawable{
	
	private int upperBound;
	private int lowerBound;
	
	public Alien(int location) {
		super("┌∩┐(◣_◢)┌∩┐", "Alien (moves to random position on the board within a +/- 2 tile range each turn"
							+ " has the ability to kill the player)", location);
		
		upperBound = location + 2;
		lowerBound = location - 2;
	}
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		Random rand = new Random();
	    int randomNum = rand.nextInt((upperBound - lowerBound) + 1) + lowerBound;
	    
	    gameBoard[this.getLocation()] = null;
	    this.setLocation(randomNum);
	    gameBoard[this.getLocation()] = this;
	    
	}

	public void draw() {
		System.out.print("┌∩┐(◣_◢)┌∩┐");
	}

	@Override
	//If the player runs into the alien the player dies
	
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		
		if(playerLocation == this.getLocation())
			return InteractionResult.KILL;
		else 
			return InteractionResult.NONE;
	}
}
