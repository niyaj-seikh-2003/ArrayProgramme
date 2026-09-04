package com.nt.array;

import java.util.HashMap;

public class FindTheSingleElement {

	public static void main(String[] args) {
		int arr[]= {5,1,2,4,3,1,2,4,3};//Every element is appearing twice except 5 so the answer should be 5;
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int ele:arr) {
			map.put(ele,map.getOrDefault(ele,0)+1);
		}
		for(int key:map.keySet()) {
			if(map.get(key)==1) {
				IO.println(key);
			}
		}
	}
}
