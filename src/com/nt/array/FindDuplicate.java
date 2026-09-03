package com.nt.array;

public class FindDuplicate {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,3,1,5,6,8,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					IO.println("Duplicate Element is:"+arr[j]);
				}
			}
		}
	}

}
