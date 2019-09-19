package game;

import adapters.Android;
import adapters.Playstation5;
import adapters.Windows;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame(new Android());
		game.play();
	}
}
