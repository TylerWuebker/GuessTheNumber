/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Apr 1, 2021
 */
package dmacc.model;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wuebk
 *
 */
@Data
@NoArgsConstructor
public class Game {
	private int player1;
	private int computerPlayer;
	private String winner;
	
	public Game(int player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	
	public void setComputerPlayerToRandom() {
		Random rand = new Random();
		
		int roll = rand.nextInt(2) + 1;
		
		this.computerPlayer = roll;
	}
	
	public void determineWinner() {
		if(this.player1 > this.computerPlayer) {
			this.winner = "Player 1";
		}
		else if(this.player1 < this.computerPlayer) {
			this.winner = "Player 2";
		}
		else {
			this.winner = "Tie!";
		}
	}
}
