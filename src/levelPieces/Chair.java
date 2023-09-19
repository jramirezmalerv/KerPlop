package levelPieces;

import gameEngine.InteractionResult;
import gameEngine.Drawable;

/**
 * Class definition for drawable object Chair.
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


//Uses the NONE interaction result


public class Chair extends GamePiece implements Drawable {
	
	public Chair(int location) {
		super("╦╣", "Chair (Does nothing)", location);
	}
	
	@Override
	public void draw() {
		System.out.print("╦╣");
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		return InteractionResult.NONE;
	}
	
	
}
