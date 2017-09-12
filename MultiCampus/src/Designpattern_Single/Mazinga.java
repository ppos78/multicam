package Designpattern_Single;

public class Mazinga {

	private Attack attack;
	private Move move;
	
//	private PunchAttack attack;
//	private WalkingMove move;
	public Mazinga() {
		attack=new MissleAttack();
		move=new WalkingMove();
	}
	public void attack() {
		// TODO Auto-generated method stub
		attack.attack();
	}
	public void move() {
		// TODO Auto-generated method stub
		move.move();
}
}