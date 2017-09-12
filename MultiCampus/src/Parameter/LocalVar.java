package Parameter;

public class LocalVar {
static int sum(int max) {
	int total = 0;
	for(int i=1;i<=max;i++)
		total+=i;
	return total;
			
}
public static void main(String[] args) {
	int result;
	result=sum(10);
	System.out.println(result);
}
}
