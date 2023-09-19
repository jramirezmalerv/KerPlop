package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


// Uses the GET_POINT interaction result

public class PowerUp extends GamePiece implements Drawable {

	public PowerUp(String symbol, String label, int location) {
		super("`ღ´", "Powerup (Gives you one point)", location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.print("`ღ´");
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		
		if (playerLocation == this.getLocation() ) {
			return InteractionResult.GET_POINT;
		}
		else {
			return InteractionResult.NONE;
		}
		
		
	}

}
