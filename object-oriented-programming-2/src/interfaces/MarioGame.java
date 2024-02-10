package interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump!");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Goes into a hole!");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go Backward");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go Forward!");
	}

}
