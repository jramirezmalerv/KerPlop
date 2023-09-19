package levelPieces;

import gameEngine.Drawable;

import gameEngine.InteractionResult;

//Uses the NONE interaction result


public class Chair extends GamePiece implements Drawable{

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
