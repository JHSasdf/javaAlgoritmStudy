package interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 다형성은 상속개념에도, 인터페이스에서도 적용
		MarioGame game = new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();
		ChessGame game2 = new ChessGame();
		game2.up();
		game2.down();
		game2.left();
		game2.right();

	}

}
