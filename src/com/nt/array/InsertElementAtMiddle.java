package com.nt.array;

import java.util.Arrays;

public class InsertElementAtMiddle {

	public static void main(String[] args) {
		int []val= {10,20,30,40,50,60,70};
		IO.println("Original array :"+Arrays.toString(val));
		
		int element=100;
		int []middlePosition=Middle.insertAtMiddlePosition(val, element);
		IO.println("After insertion of element:"+Arrays.toString(middlePosition));
	}

}
class Middle{
	public static int[] insertAtMiddlePosition(int arr[],int element) {
		int []newArray=new int[arr.length+1];
		int middle=arr.length/2;
		for(int i=0;i<arr.length ;i++) {
			newArray[i]=arr[i];
		}
		newArray[middle]=element;
		for(int i=middle;i<arr.length;i++) {
			newArray[i+1]=arr[i];
		}
		return newArray;
	}
}
