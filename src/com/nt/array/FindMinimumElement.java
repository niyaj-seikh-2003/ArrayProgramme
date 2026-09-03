package com.nt.array;

public class FindMinimumElement 
{
	
	public static void main(String[] args) {
		int arr[]= {12,9,2,34,78};
		Demo.getMinValue(arr);
	}

}
class Demo{
	public static void getMinValue(int []arr) {
		int min=arr[0];
		for(int ele:arr) {
			if(ele<min) {
				min=ele;
			}
		}
		IO.println("Minimum element in the array is:"+min);
	}
}
