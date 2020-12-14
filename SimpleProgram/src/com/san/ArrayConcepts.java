package com.san;

public class ArrayConcepts {
	
	public static void main(String args[]) {		
		
//		int a[][] = {
//				{2,4,6,8},
//				{1,3,5,7},  //Two dimention array
//				{1,2,3,4}				
//		};
		
		int a[][] = {
				{2,4,6},    //jagged array
				{1,3,5,7,5,8},
				{1,2,3,4}				
		};
		
		System.out.println(a.length);
		System.out.println(a[2].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
		System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	}

}
