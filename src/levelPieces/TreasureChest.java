package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


//Uses the ADVANCE interaction result


public class TreasureChest extends GamePiece implements Drawable{

	public TreasureChest(int location) {
		super("ll|̲̅̅●̲̅̅|̲̅̅=̲̅̅|̲̅̅●̲̅̅|ll", "Treasure Chest (Advances you to the next level", location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.print("ll|̲̅̅●̲̅̅|̲̅̅=̲̅̅|̲̅̅●̲̅̅|ll");
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		
		if(playerLocation == this.getLocation() ) {
			return InteractionResult.ADVANCE;
		}
		else {
			return InteractionResult.NONE;
		}
		
		
	}

}
