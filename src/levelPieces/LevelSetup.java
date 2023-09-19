package levelPieces;

import gameEngine.GameEngine;	// We import the package and the class to use its variables

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	
	Drawable[] gameBoard;	// We call GameEngine class
	ArrayList<Moveable> movingPieces;
	ArrayList<GamePiece> interactingPieces;

	
	public LevelSetup() {
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<Moveable>();
		interactingPieces = new ArrayList<GamePiece>();
		
		
	
	}
	
	public void createLevel(int levelNum) {
		
		if (levelNum == 1) {
			level1();
			
		}
		else if (levelNum == 2) {
			level2();
		}
		else {
			
		}
		
	}
	
	public void level1() {
		Chair chair1 = new Chair(3);
		TreasureChest treasure = new TreasureChest(10);
		Alien alien = new Alien(15);
		interactingPieces.add(treasure);
		interactingPieces.add(chair1);	
		interactingPieces.add(alien);		
		
		
		
		
		
		for(GamePiece piece : interactingPieces) {
			gameBoard[piece.getLocation()] = piece;
		}
		
	}
	
	
	public void level2() {
		
	}
	
	public Drawable[] getBoard() {
		return gameBoard;	
	}
	
	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}
	
	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}
	
	public int getPlayerStartLoc() {
		return 0;
	}
	
	
	
	
	
}

