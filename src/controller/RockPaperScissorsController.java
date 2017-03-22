package controller;

import java.util.Scanner;

import model.RockPaperScissors;

public class RockPaperScissorsController {

	private Scanner sc;
	private int score;
	private RockPaperScissors rockPaperScissors;

	public void start() {
		playRockPaperScissors();
	}

	public RockPaperScissorsController() {
		sc = new Scanner(System.in);
		this.rockPaperScissors = new RockPaperScissors();

	}

	public void playRockPaperScissors() {
		String userMessage = "";
		score = 0;
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.println("Type quit at any time to end the game");
		while (!userMessage.equalsIgnoreCase("quit")) {
			System.out.println("Do you choose rock, paper, or scissors?");
			String computerMove = rockPaperScissors.calculateMove();
			userMessage = sc.nextLine();
			if (!userMessage.equalsIgnoreCase("quit")) {
				if (!userMessage.equalsIgnoreCase("rock") && !userMessage.equalsIgnoreCase("paper")
						&& !userMessage.equalsIgnoreCase("scissors")) {
					System.out.println("Please type in rock, paper, or scissors.");
				} else {
					int roundScore = rockPaperScissors.calculateWin(userMessage, computerMove);
					score = score + roundScore;
					String winOrLose = "";
					if (roundScore == 1) {
						winOrLose = "win";
					} else if (roundScore == -1) {
						winOrLose = "lose";
					} else {
						winOrLose = "tie";
					}
					String userStatus = "You chose " + userMessage.toLowerCase() + " and the computer chose "
							+ computerMove.toLowerCase() + ", meaning you " + winOrLose
							+ ". That makes your current score: " + score;

					System.out.println(userStatus);
				}
			}
		}
		System.out.println("Thank you for playing!");
	}
}
