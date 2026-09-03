package com.nt.array;

import java.util.Arrays;

public class ModifyArrayElement {

	public static void main(String[] args) {
		int val[]= {10,20,30,40,50};
		IO.println("Original array:"+Arrays.toString(val));
		
		int[] modifyElemenr=ArrayElemenrModification.modifyElement(val);
		IO.println("After modification array:"+Arrays.toString(modifyElemenr));
		
		IO.println();
		IO.println("Original aray is:"+Arrays.toString(val));

	}

}
class ArrayElemenrModification{
	public static int[]modifyElement(int []arr){
		arr[0]=100;
		arr[1]=200;
		arr[3]=300;
		return arr;
	}
}
