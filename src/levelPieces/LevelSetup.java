package levelPieces;

import gameEngine.*;
import gameEngine.GameEngine;
import java.util.ArrayList;
import levelPieces.GamePiece;

/**
 * This class handles the level setup for level 1 and level 2.
 * @author Gray St. Amant
 * @author Josh Ramirez
 * 
 * @Date: 9/14/23
 *
 *@Collaborators: N/A
 *
 * @Sources: N/A 
 */



public class LevelSetup {
	
	Drawable[] gameBoard;
	ArrayList<Moveable> movingPieces;
	ArrayList<GamePiece> interactingPieces;

	public LevelSetup() {
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<Moveable>();
		interactingPieces = new ArrayList<GamePiece>();
	}
	
	public void createLevel(int levelNum) {
		if(levelNum == 1) {
			level1();
		}else if(levelNum== 2) {
			level2();
		}
	}
	
	public void level1() {
		//Player has to get both power ups to advance
		
		PowerUp powerUpOne = new PowerUp(10);
		PowerUp powerUpTwo = new PowerUp(20);
		Goblin goblinOne = new Goblin(4);
		Goblin goblinTwo = new Goblin(14);
		Chair chair = new Chair(19);
		
		System.out.println(powerUpOne.toString());
		System.out.println(goblinOne.toString());
		System.out.println(chair.toString());
		
		interactingPieces.add(powerUpOne);
		interactingPieces.add(powerUpTwo);

		interactingPieces.add(goblinOne);
		interactingPieces.add(goblinTwo);
		movingPieces.add(goblinOne);
		movingPieces.add(goblinTwo);
		
		interactingPieces.add(chair);

		
		for(GamePiece piece : interactingPieces) {
			gameBoard[piece.getLocation()] = piece;
		}
	}
	
	public void level2() {
		//Player must make it past the goblin and the alien to get the treasure chest and beat the level.
		gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		movingPieces = new ArrayList<Moveable>();
		interactingPieces = new ArrayList<GamePiece>();
		
		Alien alien = new Alien(16);
		
		Goblin goblin = new Goblin(5);
		
		TreasureChest treasure = new TreasureChest(20);
		
		System.out.println(alien.toString());
		System.out.println(goblin.toString());
		System.out.println(treasure.toString());

		
		movingPieces.add(alien);
		movingPieces.add(goblin);
		
		interactingPieces.add(alien);
		interactingPieces.add(goblin);
		interactingPieces.add(treasure);
		
		
		for(GamePiece piece : interactingPieces) {
			gameBoard[piece.getLocation()] = piece;
		}
		
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
