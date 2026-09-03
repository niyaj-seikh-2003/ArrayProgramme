package com.nt.array;

public class FindArray {

	public static void main(String[] args) {
		int arr[]= {20,30,10,30,40,50,90,30};
		int target=30;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				int index=i;
				IO.println(target+" element fount at "+index+" index!!");
			}
		}
	}

}
