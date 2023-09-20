package tests;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Player;
import levelPieces.Alien;
import levelPieces.Goblin;

public class TestMovingPieces {
		
	
	// Test that Goblin hits player (movement) only when player is on the same space
	
//	@Test
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
	
	// Test that Goblin's location is the same as player's location when goblin moves to the left one
	
	@Test
	public void testGoblinMovement() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Goblin goblin = new Goblin(12);
		gameBoard[12] = goblin;
		
		Player player = new Player(11);
		gameBoard[11] = player;
		
		goblin.move(gameBoard, 11);	// By default, the goblin will move left first
		
		assertTrue(player.getLocation() == goblin.getLocation());
		
		
	}
	
	
	
}



