package com.test;

public class Question3 {
	public static void main(String[] array) {
		int[] values = { 8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2 };

		int length = values.length;

		for (int i = 0; i < values.length; i++) {
			int count =0;
			for(int j=0;j<values.length;j++) {
				
				if(values[j]<=values[i]) {
					count++;
				}
				
			}
			int percentile = count*100 / length;
			
			System.out.println(percentile +" % of the numbers are less than or equal to "+values[i]);
			
		}		
		
	
		
	}

}
