package Designpattern_template;

public class Atom extends Robot{
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("머리로 공격");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("로켓엔진으로 날아서 이동하기");
	}
}
