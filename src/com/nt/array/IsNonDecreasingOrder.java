package com.nt.array;

public class IsNonDecreasingOrder {

	public static void main(String[] args) {
		int arr[]= {2,3,5,5,8,10,9};
		IO.println(isNonDecreasing(arr));

	}
	public static boolean isNonDecreasing(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}

}
