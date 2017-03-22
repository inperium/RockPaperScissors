package model;

public class RockPaperScissors {

	public String calculateMove() {
		String computerMove = "";
		int randomNum = (int) (Math.random() * 3);
		if (randomNum == 0) {
			computerMove = "Rock";
		} else if (randomNum == 1) {
			computerMove = "Paper";
		} else {
			computerMove = "Scissors";
		}
		return computerMove;
	}

	public int calculateWin(String userMove, String computerMove) {
		int score = 0;
		if (userMove.equalsIgnoreCase("rock")) {
			if(computerMove.equalsIgnoreCase("rock")){
				score=0;
			} else if(computerMove.equalsIgnoreCase("paper")){
				score=1;
			} else {
				score=-1;
			}
		} else if (userMove.equalsIgnoreCase("paper")) {
			if(computerMove.equalsIgnoreCase("rock")){
				score=-1;
			} else if(computerMove.equalsIgnoreCase("paper")){
				score=0;
			} else {
				score=1;
			}
		} else {
			if(computerMove.equalsIgnoreCase("rock")){
				score=-1;
			} else if(computerMove.equalsIgnoreCase("paper")){
				score=1;
			} else {
				score=0;
			}
		}
		return score;
	}
}