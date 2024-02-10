package interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Move piece up!");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Move piece down!");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move piece left!");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move piece right!");
	}

}
