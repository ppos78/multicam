package Designpattern_Single;

public class Test {
public static void main(String[] args) {
	Attack pa=new PunchAttack();
	Attack ma=new MissleAttack();
	Move wm=new WalkingMove();
	Move fm=new FlyingMove();
	Robot taekwon=new Robot();
	taekwon.setAttack(pa);
	taekwon.setMove(fm);
	Robot mazinga=new Robot();
	mazinga.setAttack(ma);
	mazinga.setMove(wm);
	Robot atom=new Robot();
	atom.setAttack(pa);
	atom.setMove(wm);
	
	atom.fight();
	
} 
}
