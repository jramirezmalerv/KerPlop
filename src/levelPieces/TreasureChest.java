package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Class definition for drawable object Treasure chest.
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


//Uses the ADVANCE interaction result

public class TreasureChest extends GamePiece implements Drawable{
	public TreasureChest(int location) {
		super("ll|̲̅̅●̲̅̅|̲̅̅=̲̅̅|̲̅̅●̲̅̅|ll", "Treasure Chest (Advances you to the next Level)", location);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		System.out.print("ll|̲̅̅●̲̅̅|̲̅̅=̲̅̅|̲̅̅●̲̅̅|ll");
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(playerLocation == this.getLocation())
			return InteractionResult.ADVANCE;
		else
			return InteractionResult.NONE;
	}
}
