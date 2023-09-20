package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;


/**
 * Class definition for movable object Goblin.
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


//Uses the HIT interaction result


public class Goblin extends GamePiece implements Moveable, Drawable{
	
	private int direction;
	
	public Goblin(int location) {
		super("٩(̾●̮̮̃̾•̃̾)۶", "Goblin (Moves from left to right each turn. "
				+ "If the player runs into it, they loose a health point.)", location);
		direction = -1;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		gameBoard[this.getLocation()] = null;	// Sets goblin's to null
		
		this.setLocation(this.getLocation() + direction);	// Sets goblin's location to go left
		gameBoard[this.getLocation()] = this;
		direction *= -1;	
	}	
	
	
	public void draw() {
		System.out.print("٩(̾●̮̮̃̾•̃̾)۶");
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(this.getLocation() == playerLocation)
			return InteractionResult.HIT;
		else
			return InteractionResult.NONE;
		}
}
