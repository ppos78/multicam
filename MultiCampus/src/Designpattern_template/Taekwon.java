package Designpattern_template;

public class Taekwon extends Robot {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("펀치로 공격");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		 System.out.println("날아서 이동");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		super.fight();
	}

}
