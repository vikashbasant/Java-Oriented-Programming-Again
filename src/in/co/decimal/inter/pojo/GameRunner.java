package in.co.decimal.inter.pojo;

/**
 * Here think the GameRunner as playing the game:
 **/
public class GameRunner {
	public static void main(String[] args) {

		GamingConsole[] games = { new MarioGame(), new ChessGame() };
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}

//		GamingConsole game = new MarioGame();
//		game.up();
//		game.down();
//		game.left();
//		game.right();
//
//		GamingConsole game1 = new ChessGame();
//		game1.up();
//		game1.down();
//		game1.left();
//		game1.right();

	}
}
