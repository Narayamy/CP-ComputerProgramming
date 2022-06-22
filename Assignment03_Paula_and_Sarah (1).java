import java.util.Scanner;
import java.util.ArrayList;

public class Assignment03_Paula_and_Sarah {

	public static void main(String[] args) {
		ZumbiGame theWalkingDead = new ZumbiGame();
	}

	public static class ZumbiGame {
		Scanner userInput = new Scanner(System.in);
		int numberGreenDice = 5;
		int numberYellowDice = 4;
		int numberRedDice = 3;

		// Create an array with total of player to hold the players name
		ArrayList<String> playersName = new ArrayList<String>();

		// Create an array with total of brains by player
		ArrayList<Integer> brainsByPlayer = new ArrayList<>();

		// Create an array with total of shots by player
		ArrayList<Integer> shotsByPlayer = new ArrayList<>();

		// Constructor
		public ZumbiGame() {
			runGame();
		}

		// Begin Game
		public void runGame() {

			int dices;
			char isEndOfTurn = 'n';
			// https://wiki.eclipse.org/Recommenders/CodingConventions#is_prefix_should_be_used_for_boolean_variables_and_methods.

			char keepPlaying;
			boolean hasPlayerWon = false;

			// Ask how many players will join the game
			System.out.println("how many players?????");
			// Set totalPlayers variable
			int totalPlayers = userInput.nextInt();
			userInput.nextLine();

			// Ask each player to input their name
			for (int i = 0; i < totalPlayers; i++) {
				System.out.println("How is the player " + (i+1));
				String playerName = userInput.nextLine();
				playersName.add(playerName);

				//set the array with 0 brains and shots
				brainsByPlayer.add(0);
				shotsByPlayer.add(0);
			}

			int playerIndex = 0; // index is base 0 // starts from 0

			// keep playing until a player achieve 13 brains
			while (!hasPlayerWon) {
				System.out.println("//////////////////////");
				System.out.println("Player " + playersName.get(playerIndex));
				System.out.println("//////////////////////");
				// pass the index of the next player
				playerRollDice(playerIndex);

				// Verify if there is a winner
				if (brainsByPlayer.get(playerIndex) >= 13) {
					hasPlayerWon = true;
					System.out.println("Player that won the game: " + playersName.get(playerIndex));
				}

				playerIndex++; // increment to get next player next time

				// when the last player pass, need to set to first player again
				if (playerIndex >= playersName.size()) {
					playerIndex = 0;
				}

				// reset number of dices before next player start
				numberGreenDice = 5;
				numberYellowDice = 4;
				numberRedDice = 3;
			}
		}

		public void playerRollDice(int playerIndex) {
			boolean keepPlaying = true;
			while (keepPlaying) {
				for (int i = 0; i < 3; i++) {
					rollDice(playerIndex);
				}

				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Brains: " + brainsByPlayer.get(playerIndex));
				System.out.println("Shotguns: " + shotsByPlayer.get(playerIndex));
				System.out.println(" ");				
				
				// Verify if the player received more 3 or more shotguns
				if (shotsByPlayer.get(playerIndex) >= 3) {
					keepPlaying = false;
					System.out.println("****************");
					System.out.println("3 or more shotgun: " + playersName.get(playerIndex));
					System.out.println("****************");
				} else {
					System.out.println("Do wanna play again?");
					String userDecision = userInput.nextLine();
					if (userDecision == "n") {
						keepPlaying = false;
					}
				}
			}
		}

		public void rollDice(int playerIndex) {
			int diceFace;

			// Randomly choose the dice
			int dice = takeDice();

			if (dice == 1) { // a logica para verificar a quantidade de dados tem que ficar
								// dentro do take dice. caso contrario no final do jogo, vc n vai mostrar os
								// valores corretos
				System.out.println("Dice: green");
				numberGreenDice--;
				diceFace = diceGreen();
				if (diceFace == 1) {
					brainsByPlayer.set(playerIndex, brainsByPlayer.get(playerIndex) + 1);//get the current value and increment 1
					System.out.println("Brain");
				} else if (diceFace == 2) {
					numberGreenDice++;
					System.out.println("Footprint");
				} else {
					shotsByPlayer.set(playerIndex, shotsByPlayer.get(playerIndex) + 1);
					System.out.println("Shotgun");
				}
			} else if (dice == 2) {
				System.out.println("Dice: yellow");
				numberYellowDice--;
				diceFace = diceYellow();
				if (diceFace == 1) {
					brainsByPlayer.set(playerIndex, brainsByPlayer.get(playerIndex) + 1);
					System.out.println("Brain");
				} else if (diceFace == 2) {
					numberYellowDice++;
					System.out.println("Footprint");
				} else {
					shotsByPlayer.set(playerIndex, shotsByPlayer.get(playerIndex) + 1);
					System.out.println("Shotgun");
				}
			} else if (dice == 3) {
				System.out.println("Dice: red");
				numberRedDice--;
				diceFace = diceRed();
				if (diceFace == 1) {
					brainsByPlayer.set(playerIndex, brainsByPlayer.get(playerIndex) + 1);
					System.out.println("Brain");
				} else if (diceFace == 2) {
					numberRedDice++;
					System.out.println("Footprint");
				} else {
					shotsByPlayer.set(playerIndex, shotsByPlayer.get(playerIndex) + 1);
					System.out.println("Shotgun");
				}
			}
		}

		public int diceGreen() { // Method to determine the side of dice yellow
			int diceValue = 1 + (int) (Math.random() * 6);
			if (diceValue <= 3) {
				return 1; // Value 1 = set to brain to green dice
			} else if (diceValue >= 4 && diceValue <= 5) {
				return 2; // Value 2 = set to footprint to green dice
			} else {
				return 3; // Value 3 = set to shotgun to green dice
			}
		}

		public int diceYellow() { // Method to determine the side of dice yellow
			int diceValue = 1 + (int) (Math.random() * 6);
			if (diceValue <= 2) {
				return 1; // Value 1 = set to brain to yellow dice
			} else if (diceValue >= 3 && diceValue <= 4) {
				return 2; // Value 2 = set to footprint to yellow dice
			} else {
				return 3; // Value 3 = set to shotgun to yellow dice
			}
		}

		public int diceRed() { // Method to determine the side of dice yellow
			int diceValue = 1 + (int) (Math.random() * 6);
			if (diceValue == 1) {
				return 1; // Value 1 = set to brain to red dice
			} else if (diceValue >= 2 && diceValue <= 3) {
				return 2; // Value 2 = set to footprint to red dice
			} else {
				return 3; // Value 3 = set to shotgun to red dice
			}
		}

		// Eu tornei este metodo recursivo. ;]
		// sera que da BO?
		public int takeDice() { // Method to determine the color of the dice

			int takeDice = 1 + (int) (Math.random() * 12); // Generating random numbers

			int totalDices = numberGreenDice + numberYellowDice + numberRedDice;
			if (totalDices == 0)
				return 0;

			if (takeDice <= 5) {
				if (numberGreenDice >= 1) {
					return 1; // Value 1 = set dice color to green
				} else {
					return takeDice();
				}
			} else if (takeDice >= 6 && takeDice <= 9) {
				if (numberYellowDice >= 1) {
					return 2; // Value 2 = set dice color to yellow
				} else {
					return takeDice();
				}
			} else {
				if (numberRedDice >= 1) {
					return 3; // Value 3 = set dice color to red
				} else {
					return takeDice();
				}
			}
		}
	}
}
