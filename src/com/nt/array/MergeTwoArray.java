package com.nt.array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int x[]= {10,20,30,40,50};
		int y[]= {100,200,300,400,500};
		int []elemets=Merger.mergeTwoArray(x, y);
		IO.println("After merging both the array:"+Arrays.toString(elemets));
	}

}
class Merger{
	public static int[] mergeTwoArray(int []x,int []y) {
		int []newArray=new int[x.length+y.length];
		int position=0;
		for(int element:x) {
			newArray[position]=element;
			position++;
		}
		for(int element:y) {
			newArray[position]=element;
			position++;
		}
		return newArray;
	}
}

