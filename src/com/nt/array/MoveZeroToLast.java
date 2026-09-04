package com.nt.array;

import java.util.Arrays;

public class MoveZeroToLast {

	public static void main(String[] args) {
		int arr[]= {0,1,5,9,7,0,2,5};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
		IO.println("After moving all zero to last:"+Arrays.toString(arr));

	}

}
