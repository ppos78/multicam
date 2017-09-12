package InstanceClass;

import java.util.*;
public class Lettergame {
	public static void main(String[] args){
		int answer=59;
		int guess;
		int tries=0;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.print("정답을 추측해 보시오:");
			guess=scan.nextInt();
			tries++;
			if (guess>answer)
				System.out.println("제시한 점수가 높습니다.");
			if (guess<answer)
		    	System.out.println("제시한 점수가 낮습니다.");
		}while (guess!=answer);
		System.out.printf("축하합니다.시도횟수=%d\n",tries);
	}
}
