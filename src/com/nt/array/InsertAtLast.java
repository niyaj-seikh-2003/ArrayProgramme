package com.nt.array;

import java.util.Arrays;

public class InsertAtLast {

	public static void main(String[] args) {
		int val[]= {10,20,30,40};
		IO.println("Oringnal Array:"+Arrays.toString(val));
		int element=Integer.parseInt(IO.readln("Enter the element:"));
		val=Last.insetAtLatPosition(val, element);
		IO.println("After insertion array:"+Arrays.toString(val));
	}

}
class Last{
	public static int[] insetAtLatPosition(int []arr,int element) {
		int newArray[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			newArray[i]=arr[i];	
		}
		newArray[newArray.length-1]=element;
		return newArray;
	}
}
