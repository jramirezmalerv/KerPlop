package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Goblin;

public class TestInteractions {





	@Test
	public void testTreasureChest() {
		fail("Not yet implemented");


	}


	@Test
	public void testPowerUp() {
		fail("Not yet implemented");

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
	
}
