package com.nt.array;

public class FindMaximumElement 
{
	
	public static void main(String[] args) {
		int arr[]= {12,9,2,34,78};
		Test.getMinValue(arr);
	}

}
class Test{
	public static void getMinValue(int []arr) {
		int max=arr[0];
		for(int ele:arr) {
			if(ele>max) {
				max=ele;
			}
		}
		IO.println("Minimum element in the array is:"+max);
	}
}
