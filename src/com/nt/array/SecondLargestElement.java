package com.nt.array;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[]= {12,56,98,20};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int largest=arr[arr.length-1];
		int secLargest=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]!=largest) {
				secLargest=arr[i];
				break;
			}
		}
		IO.println("Second largest element is : "+secLargest);
	}
}
