package InstanceClass;

public class Matrix_multi {
	public static void main(String[] args) {
		int [][] arr1={{5,3},{1,2}};
		int [][] arr2={{7,2},{5,3}};
		int [][] result=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++)
				result[i][j]=arr1[i][0]*arr2[0][j]+arr1[i][1]*arr2[1][j];
		}
		
//		result[0][0]=arr1[0][0]+arr2[0][0];
//		result[0][1]=arr1[0][1]+arr2[0][1];
//		result[1][0]=arr1[1][0]+arr2[1][0];
//		result[1][1]=arr1[1][1]+arr2[1][1];
//		
//		result[0][0]=arr1[0][0]*arr2[0][0]+arr1[0][1]*arr2[1][0];
//		result[0][1]=arr1[0][0]*arr2[0][1]+arr1[0][1]*arr2[1][1];
//		result[1][0]=arr1[1][0]*arr2[0][0]+arr1[1][1]*arr2[1][0];
//		result[1][1]=arr1[1][0]*arr2[0][1]+arr1[1][1]*arr2[1][1];
		
		System.out.print(result[0][0]+"  ");
		System.out.print(result[0][1]+"  ");
		System.out.println();
		System.out.print(result[1][0]+"  ");
		System.out.print(result[1][1]+"  ");
		System.out.println();

	}
}


