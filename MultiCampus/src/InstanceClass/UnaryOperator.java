package InstanceClass;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int x=1;
//int y=1;
//
//int nextx=++x;
//int nexty=y++;
//System.out.println(nextx);
//System.out.println(nexty);

int x=10;
int y=10;
int z;
System.out.println("________________");
x++;
++x;
System.out.println("x="+x);
System.out.println("________________");
y--;
--y;
System.out.println("y="+y);
System.out.println("________________");
z=x++;
System.out.println("z="+z);
System.out.println("x="+x);
System.out.println("________________");
z=++x;
System.out.println("z="+z);
System.out.println("x="+x);
System.out.println("________________");
z=++x + y++;
System.out.println("z="+z);
System.out.println("x="+x);
System.out.println("________________");

	}

}
