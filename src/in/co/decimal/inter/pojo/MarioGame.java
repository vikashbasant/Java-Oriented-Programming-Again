package in.co.decimal.inter.pojo;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump");

	}

	@Override
	public void down() {
		System.out.println("Goes into a hole");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub

	}

	@Override
	public void right() {
		System.out.println("Go forwards");

	}

}