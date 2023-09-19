package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;


// Uses the KILL interaction result

public class Alien extends GamePiece implements Moveable, Drawable{
	
	

	public Alien(int location) {
		super("┌∩┐(◣_◢)┌∩┐", "Alien (Will kill you immediately)", location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		System.out.print("┌∩┐(◣_◢)┌∩┐");
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		
		return InteractionResult.KILL;
	}

}
