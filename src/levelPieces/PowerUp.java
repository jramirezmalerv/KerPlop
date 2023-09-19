package levelPieces;

import gameEngine.InteractionResult;
import gameEngine.Drawable;

/**
 * Class definition for the drawable object Power Up.
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
 

//Uses the GET_POINT interaction result

public class PowerUp extends GamePiece implements Drawable{
	
	private int use_count;
	
	public PowerUp(int location) {
		super("-`ღ´-", "Power Up (Gives the user a point)", location);
		use_count = 0;
	}

	public void draw() {
		if(use_count == 0)
			System.out.print("-`ღ´-");
		else
			System.out.print(" ");
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(playerLocation == this.getLocation() && use_count == 0) {
			use_count++;
			return InteractionResult.GET_POINT;
		}else {
			return InteractionResult.NONE;
		}
	}
}
