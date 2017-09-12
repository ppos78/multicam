package Designpattern_Single;

public class Taekwon extends Robot {
	
	private Attack attack;
	private Move move;
	
//	private PunchAttack attack;
//	private WalkingMove move;
	public Taekwon() {
		attack=new PunchAttack();
		move=new FlyingMove();
	}
//	@Override
//	public void attack() {
//		// TODO Auto-generated method stub
//		attack.attack();
//	}
//	@Override
//	public void move() {
//		// TODO Auto-generated method stub
//		move.move();
//	}

}
