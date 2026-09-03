package com.nt.array;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int num:arr) {
			sum=sum+num;
		}
		IO.println("Toatal sum of array:"+sum);

	}

}
