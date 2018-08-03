package test6;

/**
 * Created by heqiming on 2018/08/03
 */
class Game{
	Game(int i) {
		System.out.println("game constructor");
	}

	Game() {

	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super();
		System.out.println("boardgame constructor");

	}

	BoardGame() {

	}
}

public class Chess extends BoardGame {
	Chess() {
		super();
		System.out.println("chess constructor");

	}

	Chess(int i) {

	}

	public static void main(String[] args) {
		Chess chess = new Chess(11);
	}

}

