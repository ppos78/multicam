package InstanceClass;

public class Lotto_ex {
	
		public static void main(String[] args) {
			int[] lotto;
			lotto=new int[6];
			int i=0;
			while(i<6){
				int num=(int)(Math.random()*45)+1;
				boolean flag=false;
				for( int j=0; j<i;j++)
				{
					if( num==lotto[j])
						flag=true;
				}
				if(flag)
					continue;
				else{
					lotto[i]=num;
					i++;
				}
			}
	        for(int val : lotto)   
			 System.out.print(val+" ");
	        
	        int max=lotto[0];
	        int maxIndex=0;
	        for(i=0; i<lotto.length; i++)
	        {
	        	if(max<lotto[i])
	        	{
	        		max=lotto[i];
	        	    maxIndex=i;
	        	}
	        }
	        	        
	        System.out.println("최대값:"+max);
	        System.out.println("최대값의 위치:"+maxIndex);
	        
	        int a=3;
	        int b=2;
	        int tmp;
	        tmp=b;
	        b=a;
	        a=tmp;
	        
	        }
				}
	
			
		

