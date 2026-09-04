package com.nt.array;

public class MaxConsecutiveOne {

	public static void main(String[] args) {
		int []arr= {1,1,0,1,1,1,1};
		int count=0;
		int consecutive=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				if(count>consecutive) {
					consecutive=count;
				}
			}else
				count=0;
		}
		IO.println("Total number of consecutices are:"+consecutive);

	}

}
