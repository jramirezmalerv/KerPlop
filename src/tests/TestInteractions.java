package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Goblin;
import levelPieces.PowerUp;
import levelPieces.TreasureChest;
import levelPieces.Chair;
import levelPieces.Alien;



public class TestInteractions {

	@Test
	public void testDoor() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Chair chair = new Chair(15);
		gameBoard[15] = chair;
		
		assertEquals(InteractionResult.NONE, chair.interact(gameBoard, 15));

		for(int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			assertEquals(InteractionResult.NONE, chair.interact(gameBoard, i));
		}
	}

	@Test
	public void testTreasureChest() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		TreasureChest treasure = new TreasureChest(15);
		gameBoard[15] = treasure;
		
		assertEquals(InteractionResult.ADVANCE, treasure.interact(gameBoard, 15));

		for(int i = 0; i < 14; i++) {
			assertEquals(InteractionResult.NONE, treasure.interact(gameBoard, i));
		}

		for(int i = 16; i < GameEngine.BOARD_SIZE; i++) {
			assertEquals(InteractionResult.NONE, treasure.interact(gameBoard, i));
		}
	}


	@Test
	public void testPowerUp() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		PowerUp pu = new PowerUp(15);
		gameBoard[15] = pu;
		
		assertEquals(InteractionResult.GET_POINT, pu.interact(gameBoard, 15));
		
		for(int i = 0; i < 14; i++) {
			assertEquals(InteractionResult.NONE, pu.interact(gameBoard, i));
		}

		for(int i = 16; i < GameEngine.BOARD_SIZE; i++) {
			assertEquals(InteractionResult.NONE, pu.interact(gameBoard, i));
		}
	}


	// Test that Goblin hits player (interaction) only when player is on the same space

	@Test
	public void testGoblin() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Goblin goblin = new Goblin(15);
		gameBoard[15] = goblin;


		assertEquals(InteractionResult.HIT, goblin.interact(gameBoard, 15));

		for(int i = 0; i < 14; i++) {
			assertEquals(InteractionResult.NONE, goblin.interact(gameBoard, i));
		}

		for(int i = 16; i < GameEngine.BOARD_SIZE; i++) {
			assertEquals(InteractionResult.NONE, goblin.interact(gameBoard, i));
		}


	}
	
	public void testAlien() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Alien alien = new Alien(15);
		gameBoard[15] = alien;


		assertEquals(InteractionResult.HIT, alien.interact(gameBoard, 15));

		for(int i = 0; i < 14; i++) {
			assertEquals(InteractionResult.NONE, alien.interact(gameBoard, i));
		}

		for(int i = 16; i < GameEngine.BOARD_SIZE; i++) {
			assertEquals(InteractionResult.NONE, alien.interact(gameBoard, i));
		}


	}
	
}
