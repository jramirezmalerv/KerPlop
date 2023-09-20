package tests;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Alien;
import levelPieces.Goblin;

public class TestMovingPieces {
		
	
	// Test that Goblin hits player (movement) only when player is on the same space
	
	@Test
	public void testGoblinMovement() {
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
	
	
//	@Test 
//	public void testAlienMovement() {
//		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
//		Alien alien = new Alien(5);
//		gameBoard[5] = alien;
//		
//		assertEquals(InteractionResult.HIT, alien.interact(gameBoard, 15));
//		
//		for(int i = 0; i < 14; i++) {
//			assertEquals(InteractionResult.NONE, alien.interact(gameBoard, i));
//		}
//		
//		for(int i = 16; i < GameEngine.BOARD_SIZE; i++) {
//			assertEquals(InteractionResult.NONE, alien.interact(gameBoard, i));
//		}
//	}
}



