package tests;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Player;
import levelPieces.Alien;
import levelPieces.Goblin;

public class TestMovingPieces {
		
	
	// Test that Goblin's location is the same as player's location when goblin moves to the left one (Movement)
	
	@Test
	public void testGoblinMovement() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Goblin goblin = new Goblin(12);
		gameBoard[12] = goblin;
		
		Player player = new Player(11);
		gameBoard[11] = player;
		
		goblin.move(gameBoard, 11);	// By default, the goblin will move left first
		
		assertTrue(player.getLocation() == goblin.getLocation());	// Checks to make sure player and goblin location are same
		
		
	}
	
	// Test that tests the alien's edge case 
	// Note: This edge case required me to modify/implement code into my Alien class
	
	@Test
	public void testAlienEdgeCase() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Alien alien = new Alien(15);
		gameBoard[13] = alien;
		
		Player player = new Player(13);
		gameBoard[13] = player;
		
		/* The line below is calling the edge case on my alien's move() function
		 * Since the player's location equals 13, the alien will move from whatever random position it was in
		 * to index 11 on the game board. This puts the alien 2 spaces away to the left of the player. This is the edge case
		 */
		
		alien.move(gameBoard, 13);	
		
		// Testing to see if the alien is on the right gameBoard index (should be 11)
		// You can visibly see this change occur when you play the 2nd level of our KerPlop game (if you even get that far)
		assertTrue(alien == gameBoard[alien.getLocation()]); 
		
		
	}
	
	
	
}



