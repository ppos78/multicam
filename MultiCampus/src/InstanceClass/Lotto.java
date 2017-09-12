package InstanceClass;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto;
		lotto=new int[6];
		int i=0;
//		while(i<6){
//			int num=(int)(Math.random()*45)+1;
//			boolean flag=false;
//			for( int j=0; j<i;j++)
//			{
//				if( num==lotto[j])
//					flag=true;
//			}
//			if(flag)
//				continue;
//			else{
//				lotto[i]=num;
//				i++;
//			}
//		}
//        for(int val : lotto)   
//		 System.out.print(val+" ");
//	}
//}
		while(i<6){
			int num=(int)(Math.random()*45)+1;
			System.out.println(num);
			i++;
		}
	}
}
	
		
		
	